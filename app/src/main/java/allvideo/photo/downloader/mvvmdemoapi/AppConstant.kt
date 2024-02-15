package allvideo.photo.downloader.mvvmdemoapi

class AppConstant {
    companion object {

        //urls and paths
        const val URL = "https://reqres.in/api/"


        //        const val API_VERSION = "v1/"
        const val BASE_URL = URL
        //notification
        val CHANNEL_NAME: CharSequence = "asiaeurpoejob-user"
        const val CHANNEL_ID: String = "asiaeurpoejob-user"
        const val NOTIFICATION_BROADCAST: String = "notification_broadcast"
        const val HOME_DATA = "home_data"
        const val ISNOTIFICATION = "ISNOTIFICATION"
        val NOTIFICATION_DATA: String = "data"
        val KEY_INTRO = "isIntro"



        const val NOTIFICATION_REQUEST_CODE = 15

        //nav keys
        const val SESSION_BROADCAST = "session_broadcast"
        const val VERIFICATION_BROADCAST = "session_broadcast"
        const val DATA_TYPE = "data_type"
        const val VERIFICATION_TYPE = "data_type"
        const val MEMBERSHIP_ID = "membership_id"
        const val DETAIL_ID = "deatil_id"
        const val ADD_TYPE = "add_type"
        const val SKINFIT_ID = "id"
        const val SERVICE_ID = "service_id"
        const val TREATMENT_ID = "treatment_menu_id"
        const val NAME_TREATMENT = "treatment_menu_name"
        const val APPLIED_ID = "applied_id"
        const val NUMBER = "number"
        const val LOGIN = "login"
        const val SIGNUP = "signup"


        //pref keys
        const val CONSTANT_AUTH = "constant_auth"
        const val USER_DATA = "user_data"
        const val COMPLETE_DATA = "complete_data"
        const val PREF_KEY = "pureDermatology_pref"
        const val OTHER_DATA = "pref"
        const val IS_NOTIFICATION_ON = "is_notification_on"
        const val HOME_SCREEN_DATA = "home_screen_data"
        var isSignup  = 1
        var isLogin  = 2




        //mime type
        const val MIME_PDF = "application/pdf"

        //image bottom sheet
        const val CAMERA_PERMISSION_REQUEST_CODE = 1000
        const val GALLERY_PERMISSION_REQUEST_CODE = 1001
        const val CAMERA_INTENT_REQUEST_CODE = 1003
        const val GALLERY_INTENT_REQUEST_CODE = 1004
        const val GALLERY_ANDROID_13_REQUEST_CODE = 13
        const val CAMERA_ANDROID_13_REQUEST_CODE = 14
        const val STORAGE_PERMISSION_REQUEST_CODE: Int = 100
        const val SHARE_ANDROID_13_REQUEST_CODE = 20

        const val API_DATE_FORMATE = "yyyy-MM-dd HH:mm:ss"
        const val CUSTOM_API_FORMATE = "dd MMM yyyy ,hh:mm a"


        const val data =
            "<p>This Agreement constitutes a binding agreement between Rent-a-Temp Pty Ltd t/a Rent-a-Temp<br />\r\n(&ldquo;Rent-a-Temp Pty Ltd&rdquo;) (ABN 29 631 771 125) and each User. By using the Rent-a-Temp Pty Ltd Platform,<br />\r\nUser agrees to be bound by the terms of this Agreement with Rent-a-Temp Pty Ltd. (Updated 25 June 2019)<br />\r\n<strong>1. DEFINITIONS</strong><br />\r\nIn this Agreement the following terms have the following meanings:<br />\r\n&ldquo;Rent-a-Temp Pty Ltd Platform&rdquo; means the lead generation and service provider referral system operated<br />\r\nby Rent-a-Temp Pty Ltd, and unless the context requires otherwise, includes the Rent-a-Temp Pty Ltd mobile<br />\r\ndevice app, the Rent-a-Temp Pty Ltd website and all related software and services as may be developed or<br />\r\nenhanced by Rent-a-Temp Pty Ltd from time to time;<br />\r\n&ldquo;Rent-a-Temp Pty Ltd Service Fee&rdquo; means an amount equivalent to 15 per cent (or other percentage<br />\r\nnotified from time to time on the Rent-a-Temp Pty Ltd Platform) that Rent-a-Temp Pty Ltd shall be entitled to<br />\r\nretain from funds received from a Customer in respect of a Fee, before remitting to Provider an amount<br />\r\nequivalent to the balance in accordance with this Agreement;<br />\r\n&ldquo;Assignment&rdquo;, which is known as &ldquo;Job&rdquo; on the Rent-a-Temp Pty Ltd Platform, means the provision of<br />\r\nservices (and to the extent applicable goods) by a Provider to a Customer pursuant to an Assignment<br />\r\nRequest;<br />\r\n&ldquo;Assignment Request&rdquo; means a request made by a Customer using the Rent-a-Temp Pty Ltd Platform<br />\r\nseeking the provision of services from Providers;<br />\r\n&ldquo;Customer&rdquo;, which is known as &ldquo;Business&rdquo; on the Rent-a-Temp Pty Ltd Platform, means any person that<br />\r\nuses the Rent-a-Temp Pty Ltd Platform to seek/ and or acquire the provision of Provider Services;<br />\r\n&ldquo;Fee&rdquo; means the amount payable by a Customer to a Provider in respect of an Assignment, which shall be<br />\r\nremitted by Rent-a-Temp Pty Ltd in accordance with this Agreement;<br />\r\n&ldquo;Provider&rdquo;, which is known as &ldquo;Job Seeker&rdquo; on the Rent-a-Temp Pty Ltd Platform, means an individual, being<br />\r\na provider who is registered with Rent-a-Temp Pty Ltd and who may submit an offer in respect of an<br />\r\nAssignment Request;<br />\r\n&ldquo;Provider Services&rdquo; means the services that Provider purports to be able to provide and/or offers and/or<br />\r\nprovides through the Rent-a-Temp Pty Ltd Platform; and<br />\r\n&ldquo;User&rdquo; means any person using the Rent-a-Temp Pty Ltd Platform, and includes, without limitation each<br />\r\nProvider and Customer.<br />\r\n<strong>2. REGISTRATION AND USE OF ACCOUNT</strong><br />\r\n<strong>2.1</strong> All Users acknowledge that the services of the Rent-a-Temp Pty Ltd Platform are available only to<br />\r\npersons aged 18 years and older. Users represent and warrant that they are aged 18 years or older. If a<br />\r\nUser operates through a company or other business entity, the person purporting to represent that business,<br />\r\nrepresents and warrants that they have authority to bind the User&rsquo;s entity to this Agreement and that all<br />\r\nindividuals associated with the acquisition of Provider Services will be 18 years old or older.<br />\r\n<strong>2.2</strong> Rent-a-Temp Pty Ltd retains discretion as to whether to allow or refuse any person to become a User<br />\r\nof the Rent-a-Temp Pty Ltd Platform.<br />\r\n<strong>2.3</strong> A User&rsquo;s ongoing participation in the Rent-a-Temp Pty Ltd Platform is subject to and conditional upon<br />\r\nUser providing all information requested upon application for registration and Rent-a-Temp Pty Ltd&rsquo;s<br />\r\nacceptance of a User&rsquo;s application, whether as Provider or Customer.</p>\r\n\r\n<p><strong>2.4</strong> Provider may only register an account in the name of an individual (natural person). Customer may<br />\r\nregister in the name of one or more individuals or a corporate entity. Each User&rsquo;s registration is personal to<br />\r\nthat User and cannot be assigned or transferred.<br />\r\n<strong>2.5</strong> Provider agrees to supply to Rent-a-Temp Pty Ltd any documentation or information reasonably<br />\r\nrequired by Rent-a-Temp Pty Ltd to verify Provider&rsquo;s qualifications and Provider&rsquo;s ability to supply Provider<br />\r\nServices. Customer agrees to supply to Rent-a-Temp Pty Ltd any documentation or information reasonably<br />\r\nrequired to verify Customer&rsquo;s ability to make any payment required hereunder.<br />\r\n<strong>2.6</strong> Despite clause 2.5, Rent-a-Temp Pty Ltd makes no representation to any User regarding the true<br />\r\nidentity, qualifications, status or capacity of any User.<br />\r\n<strong>2.7</strong> Upon registration, Users will be issued with an identification number and password to use and access<br />\r\nthe Rent-a-Temp Pty Ltd Platform. User remains responsible for the security of User&rsquo;s passwords, User ID<br />\r\nand control of the use of User&rsquo;s account. All activity carried out through User&rsquo;s account shall be deemed to<br />\r\nhave been carried out by User unless Rent-a-Temp Pty Ltd agrees otherwise. User agrees that Rent-a-Temp<br />\r\nPty Ltd shall be entitled to assume that any person using the Rent-a-Temp Pty Ltd Platform with User&rsquo;s<br />\r\nidentification number and/or password is User or User&rsquo;s authorised representative.<br />\r\n<strong>2.8</strong> User must immediately notify Rent-a-Temp Pty Ltd of any claim that is made against it, any actual or<br />\r\nalleged breach of any law in respect of the provision or acquisition of Provider Services, any changes to<br />\r\nUser details and change in circumstances or any other fact or matter that would or might be a basis for<br />\r\ndisqualifying User from participating in the Rent-a-Temp Pty Ltd Platform in any capacity.<br />\r\n<strong>3. HOW THE Rent-a-Temp Pty Ltd PLATFORM WORKS</strong><br />\r\n<strong>3.1</strong> The Rent-a-Temp Pty Ltd Platform operates as a neutral facilitator seeking to match the needs of<br />\r\nCustomers with Providers. The Rent-a-Temp Pty Ltd Platform enables Providers and Customers to enter into<br />\r\nagreements with each other regarding the respective provision and acquisition of Provider Services and<br />\r\nprovides a gateway for payment and administration of Fees. Rent-a-Temp Pty Ltd is not an employment or<br />\r\nrecruitment service.<br />\r\n<strong>3.2</strong> Providers are not required to provide Provider Services exclusively for the benefit of Rent-a-Temp Pty<br />\r\nLtd or Customers and free to provide such services to others as long as in doing so they do not contravene<br />\r\nany provisions of this Agreement.<br />\r\n<strong>3.3</strong> Users acknowledge and agree that Rent-a-Temp Pty Ltd is not and will not be directly involved in the<br />\r\ntransactions and arrangements between Customers and Providers and that Rent-a-Temp Pty Ltd only<br />\r\nfacilitates those agreements. Rent-a-Temp Pty Ltd accepts no liability for any aspect of transactions<br />\r\nbetween Users. Rent-a-Temp Pty Ltd is not responsible for the truth or accuracy of descriptions of any<br />\r\nProvider Services or of the nature of Customers&rsquo; business or requirements, nor for the nature or quality of<br />\r\nthe performance of any Provider Services and shall not be involved in any disputes between Customers and<br />\r\nProviders.<br />\r\n<strong>3.4</strong> There is no charge for a Customer posting an Assignment Request. Subject to any requirements or<br />\r\nlimitations that Rent-a-Temp Pty Ltd imposes in respect of Assignment Request descriptions from time to<br />\r\ntime, Customers posting Assignment Requests must include an accurate description of the nature of the<br />\r\nrespective Assignment, the services required and the Fee and charging basis applicable to the successful<br />\r\nProvider. Rent-a-Temp Pty Ltd may require, by notification in advance through the Rent-a-Temp Pty Ltd<br />\r\nPlatform, that any Assignment include a minimum fee which Providers are to be paid.<br />\r\n<strong>3.5</strong> If a Provider wishes to accept an Assignment Request Provider must do so using the mechanism<br />\r\nprovided on the Rent-a-Temp Pty Ltd Platform and such acceptance will constitute acceptance of the<br />\r\nAssignment on the basis of the information disclosed in the Assignment Request, including information as to<br />\r\nthe applicable Fee to be paid by Customer for the Provider Services. In doing so, Provider represents and<br />\r\nwarrants to Customer that Provider is able, willing and competent to perform the respective Assignment.</p>\r\n\r\n<p><strong>3.6</strong> Until such time as any given Assignment Request has been accepted by a Provider, a Customer may<br />\r\namend, update the details of or remove the Assignment Request. Once accepted both Provider and<br />\r\nCustomer are committed to proceed with performance of the Assignment. Customer and Provider will then<br />\r\nbe deemed to have entered into an agreement with each other. The terms of that agreement shall<br />\r\nincorporate the terms of (and must not contain any terms that are inconsistent with) this Agreement to the<br />\r\nextent that they are capable of applying to Customer and Provider. Provider and Customer may agree to<br />\r\nvary the terms following acceptance of an Assignment (including through the use of Rent-a-Temp Pty Ltd&rsquo;s<br />\r\nmessaging platform) except to the extent that such variation is inconsistent with this Agreement, is intended<br />\r\nto or likely to circumvent the Rent-a-Temp Pty Ltd Platform, or is otherwise designed to or has the effect of<br />\r\nreducing the amount of any Rent-a-Temp Pty Ltd Service Fee that may be retained by Rent-a-Temp Pty Ltd<br />\r\nin relation to that Assignment.<br />\r\n<strong>4. FEES, Rent-a-Temp Pty Ltd SERVICE FEES AND PAYMENTS</strong><br />\r\n<strong>4.1</strong> Upon the acceptance by Provider of an Assignment Request, Customer must pay the Fee to<br />\r\nRent-a-Temp Pty Ltd at the conclusion of the Assignment. Customer shall pay to Rent-a-Temp Pty Ltd,<br />\r\nthrough the eWay gateway mechanism provided at the Rent-a-Temp Pty Ltd Portal, the total amount of the<br />\r\nFee applicable to the Assignment. Customer must provide complete and accurate details of a valid credit<br />\r\ncard of an accepted type, through eWay. Rent-a-Temp Pty Ltd shall not store any credit card details. All<br />\r\ntransactions occur through eWay and eWay shall be responsible for the storage and handling of such<br />\r\ninformation.<br />\r\n<strong>4.2</strong> If for any reason an Assignment once accepted is cancelled or is otherwise not completed,<br />\r\nRent-a-Temp Pty Ltd shall charge the Customer a cancellation fee which has a value of $50 plus a minimum<br />\r\nof 4 times the agreed hourly rate, which shall be deducted from the amount paid to Rent-a-Temp Pty Ltd by<br />\r\nCustomer in respect of the Assignment. For example, if the Assignment was listed for $30 per hour, the<br />\r\ncancellation fee will be the sum of $50 and $120 (4 hours x $30 per hour).<br />\r\n<strong>4.3</strong> Once Provider has completed an Assignment, Provider must provide notice, using the Rent-a-Temp Pty<br />\r\nLtd Platform, that the Assignment has been completed, setting out details of the hours taken using the<br />\r\ntimesheet functionality together with any other applicable and agreed fees and charges. Customer must<br />\r\nwithin a period of 24 hours from the notification, either accept Provider&rsquo;s account of the transaction unless<br />\r\nreasonable grounds exist for disputing it, in which case it may request Provider submit a revised timesheet.<br />\r\nCustomer must provide a reasonable basis for alleging any discrepancy. Customer and Provider must act<br />\r\nreasonably and in good faith towards each other in all respects, including in the accounting for and<br />\r\nconfirmation of completion of Assignments and the time taken and applicable Fees. Customer shall be<br />\r\ndeemed to have accepted Provider&rsquo;s revised timesheet following any resubmission or original timesheet in<br />\r\nthe event of a failure to resubmit.<br />\r\n<strong>4.4</strong> Failure to accept any account for payment reasonably and honestly owed to any Provider will<br />\r\nconstitute a material breach of this Agreement and a basis for prohibiting Customer from further use of the<br />\r\nRent-a-Temp Pty Ltd Platform. Failure to honestly account for time taken and applicable charge by a<br />\r\nProvider in respect of an Assignment will constitute a material breach of this Agreement and a basis for<br />\r\nprohibiting Provider from further use of the Rent-a-Temp Pty Ltd Platform.<br />\r\n<strong>4.5</strong> Once Customer has accepted Provider&rsquo;s account of the matters referred to in clause 4.3 or not<br />\r\ndisputed it within the time frame permitted, Rent-a-Temp Pty Ltd shall be deemed authorised to facilitate the<br />\r\npayment of the amount of the Fee to Provider, subject to the retention of the Rent-a-Temp Pty Ltd Service<br />\r\nFee, using the eWay gateway. This shall occur within 48 hours of receipt of the payment from the Customer.<br />\r\n<strong>4.6</strong> Provider and Customer agree that Rent-a-Temp Pty Ltd shall be entitled to retain the Rent-a-Temp Pty<br />\r\nLtd Service Fee and shall remit an amount equivalent to the remainder of the Fee to Provider following<br />\r\nconfirmation of applicable charges in accordance with clause 4.3.<br />\r\n<strong>4.7</strong> User must not accept or otherwise enter into any agreement for any Assignment in any way that<br />\r\ncircumvents or obviates the need to make payments of the Fee through the Rent-a-Temp Pty Ltd Platform.</p>\r\n\r\n<p><strong>4.8</strong> Provider agrees that Customer shall be solely responsible for the payment to Provider of the Fee and<br />\r\nany other charges for or associated with Provider Services and that except as set out otherwise in this<br />\r\nAgreement Rent-a-Temp Pty Ltd is not responsible for invoicing, collecting or remitting such payments, nor<br />\r\nwill it be involved in or mediate any disputes between any Provider and Customer. Provider and Customer<br />\r\nagree that payment of all Fees shall be through the eWay payment facility accessible through the<br />\r\nRent-a-Temp Pty Ltd Platform.<br />\r\n<strong>4.9</strong> If GST is payable by a supplier on any supply made under this Agreement the recipient must pay to the<br />\r\nsupplier an amount equal to the GST payable on supply in addition to and at the same time as the net<br />\r\nconsideration for the supply.<br />\r\n<strong>4.10</strong> Except if and to the extent set out to the contrary in this Agreement or required at law, including under<br />\r\nany non-excludable condition under the Competition and Consumer Act 2010 (Cth) or similar legislation,<br />\r\nRent-a-Temp Pty Ltd is not required to refund any payments made by a Customer to Rent-a-Temp Pty Ltd,<br />\r\nincluding for reasons of inadequate performance or non-performance by a Provider.<br />\r\n<strong>5. DISCLAIMER AND ACKNOWLEDGEMENTS</strong><br />\r\n<strong>5.1</strong> Rent-a-Temp Pty Ltd provides Users with details of other Users on an &lsquo;as is&rsquo; basis and without any<br />\r\nwarranty, express, implied or statutory as to the reliability, trustworthiness, creditworthiness or any other<br />\r\nattribute or characteristic of any Customer.<br />\r\n<strong>5.2</strong> While Rent-a-Temp Pty Ltd endeavours to ensure that the Rent-a-Temp Pty Ltd Platform is accessible<br />\r\nat all times, it shall not be liable if it or any component is unavailable at any time or for any period. Users<br />\r\nagree and acknowledge that the Rent-a-Temp Pty Ltd Platform may experience interruptions and access<br />\r\ndifficulties from time to time and that Rent-a-Temp Pty Ltd will not be responsible for such interruptions or<br />\r\naccess difficulties. To the fullest extent legally possible, Rent-a-Temp Pty Ltd excludes any representation or<br />\r\nwarranty concerning Users, the Rent-a-Temp Pty Ltd Platform or any third party&rsquo;s goods or services or third<br />\r\nparty site or platform.<br />\r\n<strong>5.3</strong> User acknowledges that:<br />\r\n(a) User is independent of and not an employee, partner or agent of Rent-a-Temp Pty Ltd;<br />\r\n(b) Each Provider may be required to undergo or be the subject of a satisfactory police check or other<br />\r\nreference check before Provider can provide Provider Services to Customers;<br />\r\n(c) Rent-a-Temp Pty Ltd does not warrant to Users that anything on the Rent-a-Temp Pty Ltd Platform is or<br />\r\nwill be accurate, reliable, timely, complete or up to date and makes no performance warranty whatsoever<br />\r\nconcerning anything on or implied from them;<br />\r\n(d) Rent-a-Temp Pty Ltd does not offer or provide professional advice to Users on the fitness of any goods,<br />\r\nservices or information supplied by other Users or any third parties;<br />\r\n(e) Rent-a-Temp Pty Ltd is not a party to any transactions between Customer and Provider and it is<br />\r\nCustomer (and, for the avoidance of doubt, not Rent-a-Temp Pty Ltd) who is responsible for paying Provider<br />\r\nfor all Assignments. Rent-a-Temp Pty Ltd cannot and will not guarantee the ability of any Customer to<br />\r\ncomplete payment for any of Provider Services;<br />\r\n(f) Users shall be responsible for completing all transactions Users participate in (including monitoring the<br />\r\nstatus and complying with all relevant legal obligations); and<br />\r\n(g) to the extent permitted at law, Rent-a-Temp Pty Ltd shall not be liable for any loss or damage whether<br />\r\ndirectly or indirectly incurred by a User or any third person as a result of any act or omission of any User or<br />\r\nany failure or delay in Rent-a-Temp Pty Ltd doing any thing, including, but not limited to liability arising out of<br />\r\nany workplace injuries, the transmission of any information between Customers and Provider or removing<br />\r\nany information from the Rent-a-Temp Pty Ltd Platform or preventing any User from using the Rent-a-Temp<br />\r\nPty Ltd Platform.<br />\r\n<strong>5.4</strong> Users agree that to the extent permissible at law Rent-a-Temp Pty Ltd and all affiliates and related<br />\r\nentities of Rent-a-Temp Pty Ltd shall have no responsibility to them for the legality or effects of the actions or<br />\r\nomissions of other Users.<br />\r\n<strong>5.5</strong> Rent-a-Temp Pty Ltd shall have no right to and shall not control the manner in which Providers perform<br />\r\nProvider Services. Each Provider shall be responsible for determining the best method for delivery and<br />\r\nperformance of those services in accordance with Customer requests and requirements. In the absence of</p>\r\n\r\n<p>any agreement otherwise with a Customer, each Provider shall be responsible for undertaking all acts and<br />\r\npayment of all costs and expenses associated with or necessary for providing Provider Services, including,<br />\r\nwithout limitation, maintaining necessary licences, qualifications and registrations, equipment costs,<br />\r\ninsurance coverage, travel expenses and other costs and expenses.<br />\r\n<strong>6. FEEDBACK FEATURE</strong><br />\r\n<strong>6.1</strong> User acknowledges and agrees that the Rent-a-Temp Pty Ltd Platform includes a feedback feature, on<br />\r\nwhich other Users may post ratings, comments, compliments, criticisms and other observations regarding<br />\r\nUsers on the Rent-a-Temp Pty Ltd Platform. A User&rsquo;s submission to this forum is a condition of their<br />\r\nregistration. Rent-a-Temp Pty Ltd requires Users to only post ratings and comments that are honest, fair and<br />\r\nreasonable, however Rent-a-Temp Pty Ltd does not guarantee to any User or any other person that all<br />\r\ncomments and ratings will conform with this request.<br />\r\n<strong>6.2</strong> User acknowledge and agree that any information or material submitted by Users to the Rent-a-Temp<br />\r\nPty Ltd Platform for inclusion in the feedback Rent-a-Temp Pty Ltd Platform may be treated by Rent-a-Temp<br />\r\nPty Ltd as nonâ€confidential and non-proprietary and Rent-a-Temp Pty Ltd may use such material without<br />\r\nrestriction.<br />\r\n<strong>6.3</strong> In using the Rent-a-Temp Pty Ltd Platform Users must not post or transmit any material which is<br />\r\noffensive, defamatory, obscene, unlawful, vulgar, harmful, misleading, deceptive, threatening, abusive,<br />\r\nharassing or otherwise reasonably objectionable.<br />\r\n<strong>6.4</strong> Users must not impersonate any other person when posting material to or otherwise using the<br />\r\nRent-a-Temp Pty Ltd Platform, or post false testimonials or ratings about User, any User or anyone else.<br />\r\n<strong>6.5</strong> User acknowledges that any material User posts to the Rent-a-Temp Pty Ltd Platform may be removed<br />\r\nby Rent-a-Temp Pty Ltd from the Rent-a-Temp Pty Ltd Platform without notice to User at any time.<br />\r\n<strong>6.6</strong> Without limiting any other provision of this Agreement, Rent-a-Temp Pty Ltd may in its discretion<br />\r\nterminate or restrict User&rsquo;s registration and ability to use the Rent-a-Temp Pty Ltd Platform if User (in the<br />\r\nopinion of Rent-a-Temp Pty Ltd) is the subject of consistent, frequent or otherwise substantially negative<br />\r\nfeedback or complaints.<br />\r\n<strong>7. WARRANTIES</strong><br />\r\n<strong>7.1</strong> Each User agrees and warrants to Rent-a-Temp Pty Ltd that it:<br />\r\n(a) will comply with the terms of this agreement and all agreements relating to the completion of<br />\r\nAssignments, all Rent-a-Temp Pty Ltd policies and all applicable laws and regulations;<br />\r\n(b) will only post accurate information on the Rent-a-Temp Pty Ltd Platform;<br />\r\n(c) will keep informed of the operation of any laws relating to the provision of and acquisition of Provider<br />\r\nServices as relevant to them;<br />\r\n(d) is under no legal or other impediment that may prevent it fully carrying out its obligations under this<br />\r\nAgreement or otherwise performing its obligations in relation to any Assignment;<br />\r\n(e) will comply with its obligations towards customers and clients as required at law;<br />\r\n(f) will comply with its tax obligations in relation to payments payable and received in respect of<br />\r\nAssignments;<br />\r\n(g) will not use the Rent-a-Temp Pty Ltd Platform for illegal purposes, including without limitation, by<br />\r\nposting to the Rent-a-Temp Pty Ltd Platform information encouraging conduct that would constitute a<br />\r\ncriminal offence or using the Rent-a-Temp Pty Ltd Platform to transport illegal goods or provide illegal<br />\r\nservices;<br />\r\n(h) will not use any feature of the Rent-a-Temp Pty Ltd Platform (or other information obtained through<br />\r\nProvider&rsquo;s use of it) to send unsolicited commercial messages;<br />\r\n(i) will not copy, translate, reproduce, communicate to the public, adapt, vary or modify anything on or any<br />\r\npart of the Rent-a-Temp Pty Ltd Platform without Rent-a-Temp Pty Ltd&rsquo;s prior written consent;</p>\r\n\r\n<p>(j) will not use anything on the Rent-a-Temp Pty Ltd Platform for or in connection with any business or<br />\r\nenterprise (whether for profit or otherwise) that is in competition with Rent-a-Temp Pty Ltd;<br />\r\n(k) will not post to the Rent-a-Temp Pty Ltd Platform or otherwise propagate material of any kind which<br />\r\ncontains computer worms, viruses or other types of malicious or harmful programs;<br />\r\n(l) will not take any action that imposes an unreasonable or disproportionately large load on Rent-a-Temp<br />\r\nPty Ltd&rsquo;s infrastructure;<br />\r\n(m) will not damage, modify, interfere with, disrupt or destroy the files, data, passwords, devices or<br />\r\nresources that belong to Rent-a-Temp Pty Ltd or do anything that compromises the security of the<br />\r\nRent-a-Temp Pty Ltd Platform;<br />\r\n(n) will not use the Rent-a-Temp Pty Ltd Platform to engage in misleading or deceptive conduct;<br />\r\n(o) will not use the Rent-a-Temp Pty Ltd Platform to transmit junk mail, spam, chain letters or engage in<br />\r\nother flooding techniques or mass distribution of unsolicited email;<br />\r\n(p) will provide Rent-a-Temp Pty Ltd with complete and accurate contact details when using the<br />\r\nRent-a-Temp Pty Ltd Platform enabling Customers to contact Provider (and vice-versa) as requested; and<br />\r\n(q) will comply with all laws and regulations regarding the provision or acquisition of Provider Services as<br />\r\nwell as all laws and regulations relating to privacy.<br />\r\n<strong>7.2</strong> In addition, Provider warrants to Rent-a-Temp Pty Ltd and to Customers that:<br />\r\n(a) Provider is authorised, skilled, qualified and legally entitled (in Australia) to provide the Provider<br />\r\nServices that it purports to provide/offer to provide and will exercise a high degree of skill, care, courtesy<br />\r\nand professionalism in doing so;<br />\r\n(b) Provider will not be intoxicated or under the influence of any drugs when performing any Provider<br />\r\nServices;<br />\r\n(c) Provider is the owner or lessee or are otherwise in lawful possession of equipment suitable for<br />\r\nperforming Provider Services and that such equipment conforms with all applicable laws and regulations;<br />\r\n(d) Provider has all insurance required of or otherwise desirable for a service provider in Provider&rsquo;s position<br />\r\nand area of practice; and<br />\r\n(e) Provider will ensure that all information (including but not limited to that set out in any application for<br />\r\nregistration as a provider) including information relating to Provider&rsquo;s qualifications and capacity is and will<br />\r\nremain true and correct in every respect and will be updated by Provider if and when it materially changes<br />\r\nduring the period of Provider&rsquo;s use of the Rent-a-Temp Pty Ltd Platform.<br />\r\n<strong>8. Rent-a-Temp Pty Ltd&rsquo;S RESERVATION OF RIGHTS</strong><br />\r\n<strong>8.1</strong> Rent-a-Temp Pty Ltd reserves the right to:<br />\r\n(a) remove or refuse to post or relay any information and/or materials (in whole or in part) that it, in its sole<br />\r\nand absolute discretion, regards as in any way objectionable or in violation of any applicable law or this<br />\r\nAgreement without notice to User; and<br />\r\n(b) modify or discontinue the Rent-a-Temp Pty Ltd Platform or any other services Rent-a-Temp Pty Ltd<br />\r\noffers at any time.<br />\r\n<strong>9. INTELLECTUAL PROPERTY/USE OF MATERIAL</strong><br />\r\n<strong>9.1</strong> All intellectual property rights in information, data and materials used or appearing on the Rent-a-Temp<br />\r\nPty Ltd Platform including (without limitation) all software, tools, know-how, processes, trademarks, logos and<br />\r\nother materials shall remain the sole and exclusive property of Rent-a-Temp Pty Ltd or its licensors. User<br />\r\nacknowledge and agree that User shall not acquire any rights, title or interest in or to any of Rent-a-Temp<br />\r\nPty Ltd&rsquo;s intellectual property rights, and may not use them without Rent-a-Temp Pty Ltd&rsquo;s prior written<br />\r\napproval. User may not, without Rent-a-Temp Pty Ltd&rsquo;s prior written approval, promote themselves in any<br />\r\nmedia as being associated with or a provider of services through the Rent-a-Temp Pty Ltd Platform.<br />\r\n<strong>9.2</strong> To the extent that User submit any information or material to Rent-a-Temp Pty Ltd relating to an<br />\r\nAssignment Request or for otherwise posting on the Rent-a-Temp Pty Ltd Platform, User automatically grant<br />\r\nRent-a-Temp Pty Ltd a licence to use the information or material for the purpose for which it is provided.<br />\r\n<strong>9.3</strong> User agrees that information made available on this Rent-a-Temp Pty Ltd Platform is for User&rsquo;s own use<br />\r\nonly and may not be sold, used or redistributed for any other purpose.</p>\r\n\r\n<p><strong>9.4</strong> User may not use screen scraping, data mining or any similar data gathering and extraction<br />\r\ntechnological devices on this Rent-a-Temp Pty Ltd Platform for the purpose of reproducing information<br />\r\ncontained on this Rent-a-Temp Pty Ltd Platform on or through any other medium, except with Rent-a-Temp<br />\r\nPty Ltd&rsquo;s prior written consent.<br />\r\n<strong>9.5</strong> Nothing in this Agreement shall be construed as requiring User to display Rent-a-Temp Pty Ltd&rsquo;s name,<br />\r\nbrands, marks, corporate colours upon or in respect of any materials.<br />\r\n<strong>10. DISCLAIMER AND LIMITATION OF LIABILITY</strong><br />\r\n<strong>10.1</strong> Nothing in these terms shall be construed as constituting any guarantee from Rent-a-Temp Pty Ltd that<br />\r\nProvider will receive any minimum number of Assignment Requests during any particular time period or at<br />\r\nall.<br />\r\n<strong>10.2</strong> To the extent permitted by law Rent-a-Temp Pty Ltd excludes all liability to User and any other person<br />\r\nfor any loss claim or damage (whether arising in contract, negligence, tort, equity or otherwise for any loss,<br />\r\nwhether it be consequential, indirect, incidental, special, punitive, exemplary or otherwise, including, without<br />\r\nlimitation any loss of profits, loss or corruption of data, or loss of or damage to reputation or goodwill) arising<br />\r\nout of or in connection with any:<br />\r\n(a) the acts or omissions of any User including where the same results in a loss of or damage to any other<br />\r\nUser;<br />\r\n(b) use of the Rent-a-Temp Pty Ltd Platform or information on or provided through the Rent-a-Temp Pty Ltd<br />\r\nPlatform or any information or advice otherwise provided by Rent-a-Temp Pty Ltd or a User; or<br />\r\n(c) removal or termination of User&rsquo;s access to the Rent-a-Temp Pty Ltd Platform.<br />\r\n<strong>10.3</strong> To the extent permitted by law, Rent-a-Temp Pty Ltd and all affiliates and related entities of<br />\r\nRent-a-Temp Pty Ltd expressly limit their liability to User for breach of a non-excludable condition or<br />\r\nwarranty implied by virtue of any legislation to the following remedies (the choice of which is to be at<br />\r\nRent-a-Temp Pty Ltd&rsquo;s sole discretion):<br />\r\n(a) the re-supply of the services provided by Rent-a-Temp Pty Ltd; or<br />\r\n(b) the payment of the cost of having those Rent-a-Temp Pty Ltd provided services supplied again.<br />\r\n<strong>11. INDEMNITY</strong><br />\r\nTo the extent permissible at law, User indemnifies and hold Rent-a-Temp Pty Ltd and its affiliates, officers,<br />\r\ndirectors, agents and employees harmless from and against any claims, demands, proceedings, losses and<br />\r\ndamages (whether actual, special and consequential of every kind and nature, including all legal fees) made<br />\r\nor claimed by any User or third party arising out of or in any way related to User&rsquo;s use of the Rent-a-Temp<br />\r\nPty Ltd Platform, User&rsquo;s breach of this Agreement, or User&rsquo;s violation of any law or the rights of a third party.<br />\r\n<strong>12. CANCELLATION/BREACH/SUSPENSION/TERMINATION</strong><br />\r\n<strong>12.1</strong> User may cancel their registration with Rent-a-Temp Pty Ltd upon notice to Rent-a-Temp Pty Ltd. Such<br />\r\ncancellation shall not entitle User to cancel or vary any agreement already in place to provide or acquire (as<br />\r\nthe case may be) Provider Services.<br />\r\n<strong>12.2</strong> Without limiting other remedies available to Rent-a-Temp Pty Ltd at law, in equity or under this<br />\r\nAgreement, Rent-a-Temp Pty Ltd may immediately issue a warning, temporarily suspend or indefinitely<br />\r\nsuspend User&rsquo;s access to the Rent-a-Temp Pty Ltd Platform and/or terminate this Agreement if:<br />\r\n(a) Rent-a-Temp Pty Ltd, acting reasonably, believes that User has breached any terms of this Agreement;<br />\r\n(b) Rent-a-Temp Pty Ltd is unable to verify or authenticate any information User provide to it; and/or<br />\r\n(c) Rent-a-Temp Pty Ltd, acting reasonably believes that User&rsquo;s actions may cause damage and/or legal<br />\r\nliability for Rent-a-Temp Pty Ltd or other Users.<br />\r\n<strong>12.3</strong> Rent-a-Temp Pty Ltd may terminate this Agreement with immediate effect if:</p>\r\n\r\n<p>(a) User breaches any term of this Agreement and such breach is not rectified within seven (7) days of User<br />\r\nbeing notified by Rent-a-Temp Pty Ltd accordingly in writing or immediately if such breach is not capable of<br />\r\nremedy; or<br />\r\n(b) User becomes subject to any kind of insolvency event.<br />\r\n<strong>13. CIRCUMSTANCES BEYOND Rent-a-Temp Pty Ltd&rsquo;s CONTROL</strong><br />\r\nRent-a-Temp Pty Ltd will not be liable for any failure or delay in the performance of its obligations to User if<br />\r\nthat failure or delay is due to circumstances beyond Rent-a-Temp Pty Ltd&rsquo;s reasonable control including,<br />\r\nwithout limitation, any act of God or other cause including any mechanical, electronic, communications or<br />\r\nthird party supplier failure.<br />\r\n<strong>14. GENERAL</strong><br />\r\n<strong>14.1</strong> Governing Law<br />\r\nThis Agreement shall be governed in all respects by the laws of the State of New South Wales, Australia.<br />\r\nUser irrevocably submits to the non-exclusive jurisdiction of the courts of New South Wales, Australia and to<br />\r\nthe Federal Court of Australia sitting in New South Wales.<br />\r\n<strong>14.2</strong> Severability<br />\r\nThe provisions of this Agreement are severable, and if any provision of this Agreement is held to be illegal,<br />\r\ninvalid or unenforceable under present or future law, such provision may be removed and the remaining<br />\r\nprovisions shall be enforced.<br />\r\n<strong>14.3</strong> No Waiver<br />\r\nRent-a-Temp Pty Ltd&rsquo;s failure to take action with respect to a breach by User does not waive Rent-a-Temp<br />\r\nPty Ltd&rsquo;s right to take action with respect to subsequent or similar breaches.<br />\r\n<strong>14.4</strong> Entire Agreement<br />\r\nThis Agreement and those policies incorporated by reference herein set out the entire understanding and<br />\r\nagreement between the parties with respect to the subject matter hereof.<br />\r\n<strong>14.5</strong> No agency<br />\r\nUser acknowledges and agrees that Rent-a-Temp Pty Ltd is not User&rsquo;s agent.<br />\r\n<strong>14.6</strong> Survival<br />\r\nThose clauses capable of surviving termination of this Agreement shall do so.<br />\r\n<strong>14.7</strong> Variation<br />\r\nRent-a-Temp Pty Ltd may modify this Agreement at any time and such modifications shall be effective<br />\r\nimmediately upon posting the new or revised terms on the Rent-a-Temp Pty Ltd Platform.</p>\r\n"

    }
}