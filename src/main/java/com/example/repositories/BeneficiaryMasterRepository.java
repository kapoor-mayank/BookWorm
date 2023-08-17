package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.BeneficiaryMaster;



@Repository
public interface BeneficiaryMasterRepository extends JpaRepository<BeneficiaryMaster, Long> {
//	@Modifying
//	@Query("update Beneficary b set b.benName= :name, b.benEmailID=:EmailId,b.benContactNo = :ContactNo,b.benBankName = :bankname b.benBankBranch=:BankBranch, b.benIFSC = :ifsc, b.benAccNo= :accNo, b.benAccType= :accType, b.benPAN= :panId where b.benId = :id")
//	void update(@Param("name") String name,@Param("EmailId") String EmailId,@Param("ContactNo") String ContactNo, @Param("bankname") String bankname,@Param("BankBranch") String BankBranch, @Param("ifsc") String ifsc,@Param("accNo") String accNo,@Param("accType") String accType, @Param("panId") String panId,@Param("id")long id);
//		
}
