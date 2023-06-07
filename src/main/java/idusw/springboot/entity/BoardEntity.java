package idusw.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity // 엔티티 클래스임으로 나타내는 애노테이션
@Table(name = "b201909059_b")

@ToString   // lombok 라이브러리 사용
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

// JPA Auditing 을 활용하여서 생성한사람, 생성일자, 수정한사람, 수정일자 등을 선택하여서 감시
public class BoardEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "b201909059_b_seq_gen")
    @SequenceGenerator(sequenceName = "b201909059_b_seq", name = "b201909059_b_seq_gen",
            initialValue = 1, allocationSize = 1)
    // Oracle : GenerationType.SEQUENCE, Mysql/MariDB : GenerationType.IDENTITY, auto_increment
    private Long bno;
    @Column(length = 50, nullable = false)
    private String title;
    @Column(length = 1000, nullable = false)
    private String content;

    @ManyToOne
    // @JoinColumn(name = "seq")
    private MemberEntity writer; // BoardEntity : MemberEntity = N : 1,


}
