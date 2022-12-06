package testcases.CWE113_HTTP_Response_Splitting.s03;

import javax.servlet.http.*;

public class ServletMain extends HttpServlet {

	private static final long serialVersionUID = 1L; /* needed since Servlets are serializable */
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doGetCWE1(request, response);
		doGetCWE2(request, response);
		doGetCWE3(request, response);
		doGetCWE4(request, response);
		doGetCWE5(request, response);
		doGetCWE6(request, response);
		doGetCWE7(request, response);
		doGetCWE8(request, response);
		doGetCWE9(request, response);
	}
	
	private static void doGetCWE1(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-1 */
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_01()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_02()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_03()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_04()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_05()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_06()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_07()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_08()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_09()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_10()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_11()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_12()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_13()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_14()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_15()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_16()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_17()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_21()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_22a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_31()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_41()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_42()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_45()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_51a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_52a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_53a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_54a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_61a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_66a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_67a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_68a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_71a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_72a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_73a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_74a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_75a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__Property_setHeaderServlet_81a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_01()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_02()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_03()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_04()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_05()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_06()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_07()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_08()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_09()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_10()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_11()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_12()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_13()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_14()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_15()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_16()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_17()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_21()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_22a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_31()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_41()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_42()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_45()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_51a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_52a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_53a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_54a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_61a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_66a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_67a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_68a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_71a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_72a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_73a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_74a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_75a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addCookieServlet_81a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_01()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_02()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_03()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_04()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_05()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_06()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_07()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_08()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_09()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_10()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_11()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_12()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_13()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_14()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_15()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_16()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_17()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_21()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_22a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_31()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_41()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_42()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_45()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_51a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_52a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_53a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_54a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_61a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_66a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_67a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_68a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_71a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_72a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_73a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_74a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_75a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_addHeaderServlet_81a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_01()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_02()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_03()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_04()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_05()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_06()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_07()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_08()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_09()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_10()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_11()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_12()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_13()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_14()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_15()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_16()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_17()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_21()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_22a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_31()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_41()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_42()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_45()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_51a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_52a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_53a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_54a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_61a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_66a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_67a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_68a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_71a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_72a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_73a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_74a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_75a()).runTest(request, response);
			(new testcases.CWE113_HTTP_Response_Splitting.s03.CWE113_HTTP_Response_Splitting__URLConnection_setHeaderServlet_81a()).runTest(request, response);
			/* END-AUTOGENERATED-SERVLET-TESTS-1 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE1 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE2(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-2 */

			/* END-AUTOGENERATED-SERVLET-TESTS-2 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE2 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE3(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-3 */

			/* END-AUTOGENERATED-SERVLET-TESTS-3 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE3 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE4(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-4 */

			/* END-AUTOGENERATED-SERVLET-TESTS-4 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE4 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}
		
	private static void doGetCWE5(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-5 */

			/* END-AUTOGENERATED-SERVLET-TESTS-5 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE5 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {

				System.out.println("  " + ste.toString());
			} 
		}
	}		
		
	private static void doGetCWE6(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-6 */

			/* END-AUTOGENERATED-SERVLET-TESTS-6 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE6 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}

	private static void doGetCWE7(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-7 */

			/* END-AUTOGENERATED-SERVLET-TESTS-7 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE7 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
	
	private static void doGetCWE8(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-8 */

			/* END-AUTOGENERATED-SERVLET-TESTS-8 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE8 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}	
	
	private static void doGetCWE9(HttpServletRequest request, HttpServletResponse response) {
		try {
			/* BEGIN-AUTOGENERATED-SERVLET-TESTS-9 */

			/* END-AUTOGENERATED-SERVLET-TESTS-9 */
		} catch (Throwable t) {

			/* this will only happen on an IOException or something (the runTest for the test cases will catch any exceptions from the test cases).  So, we just abort
			 * and write to the console (since we can't write to the response without possibly throwing another exception)
			 */
			
			System.out.println(
					" Caught thowable from doGetCWE9 ");

			System.out.println(" Throwable's message = " + t.getMessage());
			
			System.out.println("Stack trace below");

			StackTraceElement stes[] = t.getStackTrace();

			for (StackTraceElement ste : stes) {
				System.out.println("  " + ste.toString());
			} 
		}
	}		
}
