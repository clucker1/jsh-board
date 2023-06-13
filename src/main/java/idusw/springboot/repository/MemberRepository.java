package idusw.springboot.repository;


import idusw.springboot.entity.MemberEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>,
        QuerydslPredicateExecutor<MemberEntity> {

    // JPQL
    @Transactional
    @Query("select m from MemberEntity m where m.email = :email and m.pw = :pw")
    MemberEntity getByEmailPw(@Param("email") String email, @Param("pw") String pw);
    MemberEntity getByEmail(@Param("email") String email);

    List<MemberEntity> getMemberEntitiesByEmail(@Param("email") String email);
    //List<MemberEntity> findMemberEntitiesByEmail(@Param("email") String email);

    List<MemberEntity> findMemberEntitiesByEmailLike(@Param("email") String email);

    List<MemberEntity> findMemberEntitiesByEmailContaining(@Param("email") String email);
    List<MemberEntity> findMemberEntitiesByEmailContainingOrderBySeqDesc(@Param("email") String email);

}