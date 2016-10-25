public class Knock072 extends HttpServlet {
    private final static Logger logger = Logger.getLogger("SampleCodeLogger");

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // ���N�G�X�g�p�����^�ɃG���R�[�h�w����s��
        req.setCharacterEncoding("UTF-8");
        // ���X�|���X�ɃR���e���c�^�C�v���Z�b�g
        res.setContentType("application/json; charset=UTF-8");
        String page = req.getParameter("page");
        
        // String�^��page�ϐ����`�F�b�N���A�e������s���N���X���Ăяo��. �C���ӏ� #1
        CheckStringValidator pageOperation = new CheckStringValidator();
        
        boolean state = pageOperation.isValidAndProcess(req, res);
        
        /* ���^�[���R�[�h�̐ݒ�. */
        if (state) {
            res.setStatus(HttpServletResponse.SC_OK);
        } else {
            res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}