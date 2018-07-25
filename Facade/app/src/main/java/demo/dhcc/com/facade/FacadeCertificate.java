package demo.dhcc.com.facade;

/**
 * 三证合一 门面模式
 *
 * @author 512573717@qq.com
 * @created 2018/7/25  下午2:30.
 */
public class FacadeCertificate {

    private OrganizationCertificate mOrganizationCertificate;
    private TaxationCertificate mTaxationCertificate;
    private BusinessCertificate mBusinessCertificate;

    public FacadeCertificate() {
        mOrganizationCertificate = new OrganizationCertificate();
        mTaxationCertificate = new TaxationCertificate();
        mBusinessCertificate = new BusinessCertificate();
    }

    public void transact() {

        System.out.println("收到申请人提供的材料");
        // 办理营业执照
        mBusinessCertificate.transaction();
        // 组织机构
        mOrganizationCertificate.transaction();
        // 税务证
        mTaxationCertificate.transaction();
    }
}
