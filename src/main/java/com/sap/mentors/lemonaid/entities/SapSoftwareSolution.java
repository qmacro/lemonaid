package com.sap.mentors.lemonaid.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sap_software_solutions")
public class SapSoftwareSolution {

	public static final String ACCELERATED_APPLICATION_DELIVERY = "accelerated_application_delivery";
	public static final String APPLICATION_DEVELOPMENT_PLATFORM = "application_development_platform";
	public static final String APPLICATION_LIFECYCLE_MANAGEMENT = "application_lifecycle_management";
	public static final String APPLICATIONS_POWERED_BY_SAP_HANA = "applications_powered_by_sap_hana";
	public static final String ARIBA_CLOUD_INTEGRATION = "ariba_cloud_integration";
	public static final String ARIBA_CONTRACT_MANAGEMENT = "ariba_contract_management";
	public static final String ARIBA_NETWORK = "ariba_network";
	public static final String ARIBA_NETWORK_FINANCE = "ariba_network_finance";
	public static final String ARIBA_NETWORK_INTEGRATION_FOR_SAP_BUSINESS_SUITE = "ariba_network_integration_for_sap_business_suite";
	public static final String ARIBA_NETWORK_PROCUREMENT = "ariba_network_procurement";
	public static final String ARIBA_NETWORK_SOURCING = "ariba_network_sourcing";
	public static final String ARIBA_PROCUREMENT = "ariba_procurement";
	public static final String ARIBA_SOURCING = "ariba_sourcing";
	public static final String BIG_DATA_ANALYTICS = "big_data_analytics";
	public static final String BIG_DATA_APPLICATIONS = "big_data_applications";
	public static final String BIG_DATA_PLATFORM = "big_data_platform";
	public static final String BIG_DATA_SERVICES = "big_data_services";
	public static final String BUSINESS_INTELLIGENCE = "business_intelligence";
	public static final String BUSINESS_NETWORKS = "business_networks";
	public static final String CHOAI_ROUTE_MANAGEMENT_LOCALIZATION_FOR_JAPAN = "choai_route_management_localization_for_japan";
	public static final String COLLABORATION_TOOLS = "collaboration_tools";
	public static final String COLLABORATIVE_QUOTE_TO_CASH = "collaborative_quote_to_cash";
	public static final String CONCUR_TRAVEL_AND_EXPENSE_MANAGEMENT = "concur_travel_and_expense_management";
	public static final String CONSUMER_INSIGHTS = "consumer_insights";
	public static final String CUSTOMER_ENGAGEMENT_AND_CRM = "customer_engagement_and_crm";
	public static final String DATA_MANAGEMENT = "data_management";
	public static final String DATA_WAREHOUSING = "data_warehousing";
	public static final String ENTERPRISE_INFORMATION_MANAGEMENT = "enterprise_information_management";
	public static final String ENTERPRISE_MOBILITY_MANAGEMENT = "enterprise_mobility_management";
	public static final String ENTERPRISE_PERFORMANCE_MANAGEMENT = "enterprise_performance_management";
	public static final String ENTERPRISE_TECHNOLOGY = "enterprise_technology";
	public static final String FIELDGLASS_FLEXIBLE_LABOR_MANAGEMENT = "fieldglass_flexible_labor_management";
	public static final String GOVERNANCE_RISK_AND_COMPLIANCE = "governance_risk_and_compliance";
	public static final String INMEMORY_TECHNOLOGY = "inmemory_technology";
	public static final String IT_INFRASTRUCTURE_MANAGEMENT = "it_infrastructure_management";
	public static final String LOGISTICS_ADDON_FOR_IMPORTEXPORT_LOCALIZATION_FOR_INDIA = "logistics_addon_for_importexport_localization_for_india";
	public static final String MANAGED_MOBILITY = "managed_mobility";
	public static final String MANAGER_SELFSERVICES_ADDON = "manager_selfservices_addon";
	public static final String MASTER_DATA_MANAGEMENT_FOR_COMMERCE = "master_data_management_for_commerce";
	public static final String MIDDLEWARE = "middleware";
	public static final String MOBILE_ENTERPRISE_SERVICES = "mobile_enterprise_services";
	public static final String MOBILE_INDUSTRY_APPS = "mobile_industry_apps";
	public static final String MOBILE_LINE_OF_BUSINESS_APPS = "mobile_line_of_business_apps";
	public static final String MOBILE_OPERATOR_SERVICES = "mobile_operator_services";
	public static final String MOBILE_TECHNOLOGY = "mobile_technology";
	public static final String OMNICHANNEL_COMMERCE_MANAGEMENT = "omnichannel_commerce_management";
	public static final String OUTPUT_MANAGEMENT_IFBA = "output_management_ifba";
	public static final String PARTNER_MANAGED_CLOUD = "partner_managed_cloud";
	public static final String PREDICTIVE_ANALYTICS = "predictive_analytics";
	public static final String S4HANA = "s4hana";
	public static final String SALES_FORCE_AUTOMATION = "sales_force_automation";
	public static final String SALES_PERFORMANCE_MANAGEMENT = "sales_performance_management";
	public static final String SAP_ACCELERATED_TRADE_PROMOTION_PLANNING = "sap_accelerated_trade_promotion_planning";
	public static final String SAP_ACCESS_APPROVER = "sap_access_approver";
	public static final String SAP_ACCESS_CONTROL = "sap_access_control";
	public static final String SAP_ACCESS_VIOLATION_MANAGEMENT_BY_GREENLIGHT = "sap_access_violation_management_by_greenlight";
	public static final String SAP_ADAPTIVE_SERVER_ENTERPRISE = "sap_adaptive_server_enterprise";
	public static final String SAP_ADDRESS_DIRECTORIES = "sap_address_directories";
	public static final String SAP_ADVANCED_PLANNING_AND_OPTIMIZATION = "sap_advanced_planning_and_optimization";
	public static final String SAP_ADVANCED_TRACK_AND_TRACE_FOR_PHARMACEUTICALS = "sap_advanced_track_and_trace_for_pharmaceuticals";
	public static final String SAP_AFARIA = "sap_afaria";
	public static final String SAP_AGRICULTURAL_CONTRACT_MANAGEMENT = "sap_agricultural_contract_management";
	public static final String SAP_ANYWHERE = "sap_anywhere";
	public static final String SAP_API_MANAGEMENT = "sap_api_management";
	public static final String SAP_APPAREL_AND_FOOTWEAR = "sap_apparel_and_footwear";
	public static final String SAP_APPLICATION_INTERFACE_FRAMEWORK = "sap_application_interface_framework";
	public static final String SAP_APPLICATION_VISUALIZATION_BY_IRISE = "sap_application_visualization_by_irise";
	public static final String SAP_AR_SERVICE_TECHNICIAN = "sap_ar_service_technician";
	public static final String SAP_AR_WAREHOUSE_PICKER = "sap_ar_warehouse_picker";
	public static final String SAP_ARCHIVING_AND_DOCUMENT_ACCESS_BY_OPENTEXT = "sap_archiving_and_document_access_by_opentext";
	public static final String SAP_ASSESSMENT_MANAGEMENT_BY_QUESTIONMARK = "sap_assessment_management_by_questionmark";
	public static final String SAP_ASSET_LIFECYCLE_ACCOUNTING = "sap_asset_lifecycle_accounting";
	public static final String SAP_ASSET_RETIREMENT_OBLIGATION_MANAGEMENT = "sap_asset_retirement_obligation_management";
	public static final String SAP_ASSURANCE_AND_COMPLIANCE_SOFTWARE = "sap_assurance_and_compliance_software";
	public static final String SAP_AUGMENTED_REALITY_APPS = "sap_augmented_reality_apps";
	public static final String SAP_BANK_ANALYZER = "sap_bank_analyzer";
	public static final String SAP_BULK_FUEL_MANAGEMENT = "sap_bulk_fuel_management";
	public static final String SAP_BUSINESS_ALLINONE = "sap_business_allinone";
	public static final String SAP_BUSINESS_BYDESIGN = "sap_business_bydesign";
	public static final String SAP_BUSINESS_ONE = "sap_business_one";
	public static final String SAP_BUSINESS_ONE_CLOUD = "sap_business_one_cloud";
	public static final String SAP_BUSINESS_PLANNING_AND_CONSOLIDATION = "sap_business_planning_and_consolidation";
	public static final String SAP_BUSINESS_PROCESS_AUTOMATION_BY_REDWOOD = "sap_business_process_automation_by_redwood";
	public static final String SAP_BUSINESS_WAREHOUSE_ACCELERATOR = "sap_business_warehouse_accelerator";
	public static final String SAP_BUSINESSOBJECTS_ANALYSIS_EDITION_FOR_MICROSOFT_OFFICE = "sap_businessobjects_analysis_edition_for_microsoft_office";
	public static final String SAP_BUSINESSOBJECTS_BUSINESS_INTELLIGENCE = "sap_businessobjects_business_intelligence";
	public static final String SAP_BUSINESSOBJECTS_DASHBOARDS = "sap_businessobjects_dashboards";
	public static final String SAP_BUSINESSOBJECTS_DESIGN_STUDIO = "sap_businessobjects_design_studio";
	public static final String SAP_BUSINESSOBJECTS_EXPLORER = "sap_businessobjects_explorer";
	public static final String SAP_CAPITAL_YIELD_TAX_MANAGEMENT = "sap_capital_yield_tax_management";
	public static final String SAP_CASH_FLOW_MANAGEMENT_FOR_BANKING = "sap_cash_flow_management_for_banking";
	public static final String SAP_CLOUD_APPLIANCE_LIBRARY = "sap_cloud_appliance_library";
	public static final String SAP_CLOUD_APPLICATIONS_STUDIO = "sap_cloud_applications_studio";
	public static final String SAP_CLOUD_FOR_ANALYTICS = "sap_cloud_for_analytics";
	public static final String SAP_CLOUD_FOR_CUSTOMER_CRM_CLOUD = "sap_cloud_for_customer_crm_cloud";
	public static final String SAP_CLOUD_FOR_TRAVEL_AND_EXPENSE = "sap_cloud_for_travel_and_expense";
	public static final String SAP_CLOUD_IDENTITY = "sap_cloud_identity";
	public static final String SAP_COLLABORATION_TOOLS = "sap_collaboration_tools";
	public static final String SAP_COMMERCIAL_PROJECT_MANAGEMENT = "sap_commercial_project_management";
	public static final String SAP_COMMON_AREA_MAINTENANCE_EXPENSE_RECOVERY = "sap_common_area_maintenance_expense_recovery";
	public static final String SAP_COMMUNICATION_CENTER_BY_ANCILE = "sap_communication_center_by_ancile";
	public static final String SAP_COMPLEX_ASSEMBLY_MANUFACTURING = "sap_complex_assembly_manufacturing";
	public static final String SAP_COMPLEX_MANUFACTURING_ACCELERATOR = "sap_complex_manufacturing_accelerator";
	public static final String SAP_COMPOSITION_ENVIRONMENT = "sap_composition_environment";
	public static final String SAP_CONFIGURE_PRICE_AND_QUOTE = "sap_configure_price_and_quote";
	public static final String SAP_CONNECTED_LOGISTICS = "sap_connected_logistics";
	public static final String SAP_CONNECTED_MANUFACTURING = "sap_connected_manufacturing";
	public static final String SAP_CONSUMER_INSIGHT_365 = "sap_consumer_insight_365";
	public static final String SAP_CONTACT_CENTER = "sap_contact_center";
	public static final String SAP_CONTENT_MANAGEMENT_FOR_MICROSOFT_SHAREPOINT_BY_OPENTEXT = "sap_content_management_for_microsoft_sharepoint_by_opentext";
	public static final String SAP_CONVERGENT_CHARGING = "sap_convergent_charging";
	public static final String SAP_CONVERGENT_MEDIATION_BY_DIGITALROUTE = "sap_convergent_mediation_by_digitalroute";
	public static final String SAP_CONVERGENT_PRICING_SIMULATION = "sap_convergent_pricing_simulation";
	public static final String SAP_CPROJECT_SUITE = "sap_cproject_suite";
	public static final String SAP_CRM_SERVICE_MANAGER = "sap_crm_service_manager";
	public static final String SAP_CROSS_CHANNEL_ORDER_MANAGEMENT_FOR_RETAIL = "sap_cross_channel_order_management_for_retail";
	public static final String SAP_CRYSTAL_REPORTS = "sap_crystal_reports";
	public static final String SAP_CRYSTAL_SERVER = "sap_crystal_server";
	public static final String SAP_CUSTOMER_ACTIVITY_REPOSITORY = "sap_customer_activity_repository";
	public static final String SAP_CUSTOMER_BRIEFING = "sap_customer_briefing";
	public static final String SAP_CUSTOMER_CHECKOUT = "sap_customer_checkout";
	public static final String SAP_CUSTOMER_FINANCIAL_FACTSHEET = "sap_customer_financial_factsheet";
	public static final String SAP_CUSTOMER_RELATIONSHIP_MANAGEMENT_CRM_ONPREMISE = "sap_customer_relationship_management_crm_onpremise";
	public static final String SAP_DATA_MAINTENANCE_FOR_SAP_ERP_BY_VISTEX = "sap_data_maintenance_for_sap_erp_by_vistex";
	public static final String SAP_DATA_QUALITY_MANAGEMENT = "sap_data_quality_management";
	public static final String SAP_DATA_SERVICES = "sap_data_services";
	public static final String SAP_DECISION_SERVICE_MANAGEMENT = "sap_decision_service_management";
	public static final String SAP_DEMAND_SIGNAL_MANAGEMENT = "sap_demand_signal_management";
	public static final String SAP_DEPOSITS_MANAGEMENT = "sap_deposits_management";
	public static final String SAP_DIGITAL_ASSET_MANAGEMENT_BY_OPENTEXT = "sap_digital_asset_management_by_opentext";
	public static final String SAP_DIRECT_STORE_DELIVERY = "sap_direct_store_delivery";
	public static final String SAP_DISCLOSURE_MANAGEMENT = "sap_disclosure_management";
	public static final String SAP_DOCUMENT_BUILDER = "sap_document_builder";
	public static final String SAP_DOCUMENT_PRESENTMENT_BY_OPENTEXT = "sap_document_presentment_by_opentext";
	public static final String SAP_DYNAMIC_AUTHORIZATION_MANAGEMENT_BY_NEXTLABS = "sap_dynamic_authorization_management_by_nextlabs";
	public static final String SAP_EAM_AND_SERVICE_MOBILE_APP_SDK = "sap_eam_and_service_mobile_app_sdk";
	public static final String SAP_EHS_REGULATORY_CONTENT = "sap_ehs_regulatory_content";
	public static final String SAP_EHS_SAFETY_ISSUE = "sap_ehs_safety_issue";
	public static final String SAP_ELECTRONIC_INVOICING_FOR_BRAZIL = "sap_electronic_invoicing_for_brazil";
	public static final String SAP_EMPLOYEE_FILE_MANAGEMENT_BY_OPENTEXT = "sap_employee_file_management_by_opentext";
	public static final String SAP_EMR_UNWIRED = "sap_emr_unwired";
	public static final String SAP_ENERGY_DATA_MANAGEMENT = "sap_energy_data_management";
	public static final String SAP_ENERGY_PORTFOLIO_MANAGEMENT = "sap_energy_portfolio_management";
	public static final String SAP_ENGINEERING_CONTROL_CENTER = "sap_engineering_control_center";
	public static final String SAP_ENHANCED_MAINTENANCE_AND_SERVICE_PLANNING = "sap_enhanced_maintenance_and_service_planning";
	public static final String SAP_ENTERPRISE_DEMAND_SENSING = "sap_enterprise_demand_sensing";
	public static final String SAP_ENTERPRISE_INVENTORY_AND_SERVICELEVEL_OPTIMIZATION = "sap_enterprise_inventory_and_servicelevel_optimization";
	public static final String SAP_ENTERPRISE_LEARNING = "sap_enterprise_learning";
	public static final String SAP_ENTERPRISE_MODELING_BY_SOFTWARE_AG = "sap_enterprise_modeling_by_software_ag";
	public static final String SAP_ENTERPRISE_PORTAL = "sap_enterprise_portal";
	public static final String SAP_ENTERPRISE_PROJECT_CONNECTION = "sap_enterprise_project_connection";
	public static final String SAP_ENTERPRISE_THREAT_DETECTION = "sap_enterprise_threat_detection";
	public static final String SAP_ENVIRONMENT_HEALTH_AND_SAFETY_MANAGEMENT = "sap_environment_health_and_safety_management";
	public static final String SAP_ENVIRONMENTAL_COMPLIANCE = "sap_environmental_compliance";
	public static final String SAP_ERP = "sap_erp";
	public static final String SAP_EVENT_MANAGEMENT = "sap_event_management";
	public static final String SAP_EVENT_STREAM_PROCESSOR = "sap_event_stream_processor";
	public static final String SAP_EVENT_TICKETING = "sap_event_ticketing";
	public static final String SAP_EXTENDED_DIAGNOSTICS_BY_CA = "sap_extended_diagnostics_by_ca";
	public static final String SAP_EXTENDED_ENTERPRISE_CONTENT_MANAGEMENT_BY_OPENTEXT = "sap_extended_enterprise_content_management_by_opentext";
	public static final String SAP_EXTENDED_WAREHOUSE_MANAGEMENT = "sap_extended_warehouse_management";
	public static final String SAP_FASHION_MANAGEMENT = "sap_fashion_management";
	public static final String SAP_FIELDGLASS_VENDOR_MANAGEMENT_SYSTEM = "sap_fieldglass_vendor_management_system";
	public static final String SAP_FILE_LIFECYCLE_MANAGEMENT = "sap_file_lifecycle_management";
	public static final String SAP_FINANCIAL_CLOSING_COCKPIT = "sap_financial_closing_cockpit";
	public static final String SAP_FINANCIAL_CONSOLIDATION = "sap_financial_consolidation";
	public static final String SAP_FINANCIAL_INFORMATION_MANAGEMENT = "sap_financial_information_management";
	public static final String SAP_FINANCIAL_SERVICES_NETWORK = "sap_financial_services_network";
	public static final String SAP_FINANCIAL_SUPPLY_CHAIN_MANAGEMENT = "sap_financial_supply_chain_management";
	public static final String SAP_FIORI = "sap_fiori";
	public static final String SAP_FIORY = "sap_fiory";
	public static final String SAP_FLEXIBLE_SOLUTION_BILLING = "sap_flexible_solution_billing";
	public static final String SAP_FORECASTING_AND_REPLENISHMENT_FOR_RETAIL = "sap_forecasting_and_replenishment_for_retail";
	public static final String SAP_FORTIFY_BY_HP = "sap_fortify_by_hp";
	public static final String SAP_FUNDRAISING_MANAGEMENT = "sap_fundraising_management";
	public static final String SAP_GATEWAY = "sap_gateway";
	public static final String SAP_GLOBAL_BATCH_TRACEABILITY = "sap_global_batch_traceability";
	public static final String SAP_GLOBAL_TRADE_SERVICES = "sap_global_trade_services";
	public static final String SAP_HANA = "sap_hana";
	public static final String SAP_HANA_CLOUD_INTEGRATION = "sap_hana_cloud_integration";
	public static final String SAP_HANA_CLOUD_PLATFORM = "sap_hana_cloud_platform";
	public static final String SAP_HANA_CLOUD_PLATFORM_FOR_THE_INTERNET_OF_THINGS = "sap_hana_cloud_platform_for_the_internet_of_things";
	public static final String SAP_HANA_CLOUD_PORTAL = "sap_hana_cloud_portal";
	public static final String SAP_HANA_ENTERPRISE_CLOUD = "sap_hana_enterprise_cloud";
	public static final String SAP_HANA_ENTERPRISE_CLOUD_CONSULTING_SERVICES = "sap_hana_enterprise_cloud_consulting_services";
	public static final String SAP_HANA_LIVE = "sap_hana_live";
	public static final String SAP_HANA_VORA = "sap_hana_vora";
	public static final String SAP_HYBRIS_COMMERCE_SUITE = "sap_hybris_commerce_suite";
	public static final String SAP_HYBRIS_MARKETING = "sap_hybris_marketing";
	public static final String SAP_IDENTITY_ANALYTICS = "sap_identity_analytics";
	public static final String SAP_IDENTITY_MANAGEMENT = "sap_identity_management";
	public static final String SAP_INCENTIVE_ADMINISTRATION_BY_VISTEX = "sap_incentive_administration_by_vistex";
	public static final String SAP_INFOMAKER = "sap_infomaker";
	public static final String SAP_INFORMATION_STEWARD = "sap_information_steward";
	public static final String SAP_INNOVATION_MANAGEMENT = "sap_innovation_management";
	public static final String SAP_INSTORE_PRODUCT_LOOKUP = "sap_instore_product_lookup";
	public static final String SAP_INTEGRATED_BUSINESS_PLANNING = "sap_integrated_business_planning";
	public static final String SAP_INTERCOMPANY = "sap_intercompany";
	public static final String SAP_INTERCOMPANY_DATA_EXCHANGE = "sap_intercompany_data_exchange";
	public static final String SAP_INVENTORY_MANAGER = "sap_inventory_manager";
	public static final String SAP_INVOICE_MANAGEMENT_BY_OPENTEXT = "sap_invoice_management_by_opentext";
	public static final String SAP_IQ = "sap_iq";
	public static final String SAP_IT_INFRASTRUCTURE_MANAGEMENT = "sap_it_infrastructure_management";
	public static final String SAP_JAM = "sap_jam";
	public static final String SAP_JAM_COMMUNITIES = "sap_jam_communities";
	public static final String SAP_KNOWLEDGE_ACCELERATION = "sap_knowledge_acceleration";
	public static final String SAP_KNOWLEDGE_CENTRAL_BY_MINDTOUCH = "sap_knowledge_central_by_mindtouch";
	public static final String SAP_LANDSCAPE_TRANSFORMATION = "sap_landscape_transformation";
	public static final String SAP_LANDSCAPE_VIRTUALIZATION_MANAGEMENT = "sap_landscape_virtualization_management";
	public static final String SAP_LEASE_ADMINISTRATION_BY_NAKISA = "sap_lease_administration_by_nakisa";
	public static final String SAP_LIQUIDITY_RISK_MANAGEMENT = "sap_liquidity_risk_management";
	public static final String SAP_LOADRUNNER_BY_HP = "sap_loadrunner_by_hp";
	public static final String SAP_LOANS_MANAGEMENT = "sap_loans_management";
	public static final String SAP_LUMIRA = "sap_lumira";
	public static final String SAP_LUMIRA_CLOUD = "sap_lumira_cloud";
	public static final String SAP_MANAGEMENT_OF_CHANGE = "sap_management_of_change";
	public static final String SAP_MANAGER_INSIGHT = "sap_manager_insight";
	public static final String SAP_MANUFACTURING_EXECUTION = "sap_manufacturing_execution";
	public static final String SAP_MANUFACTURING_INTEGRATION_AND_INTELLIGENCE = "sap_manufacturing_integration_and_intelligence";
	public static final String SAP_MASTER_DATA_GOVERNANCE = "sap_master_data_governance";
	public static final String SAP_MILITARY_DATA_EXCHANGE = "sap_military_data_exchange";
	public static final String SAP_MOBILE_APP_PROTECTION_BY_MOCANA = "sap_mobile_app_protection_by_mocana";
	public static final String SAP_MOBILE_ASSET_MANAGEMENT = "sap_mobile_asset_management";
	public static final String SAP_MOBILE_DEFENSE_SECURITY = "sap_mobile_defense_security";
	public static final String SAP_MOBILE_DOCUMENTS = "sap_mobile_documents";
	public static final String SAP_MOBILE_PLATFORM = "sap_mobile_platform";
	public static final String SAP_MOBILE_SECURE = "sap_mobile_secure";
	public static final String SAP_MULTICHANNEL_FOUNDATION = "sap_multichannel_foundation";
	public static final String SAP_MULTIRESOURCE_SCHEDULING = "sap_multiresource_scheduling";
	public static final String SAP_NETWEAVER = "sap_netweaver";
	public static final String SAP_NETWEAVER_MASTER_DATA_MANAGEMENT = "sap_netweaver_master_data_management";
	public static final String SAP_NETWEAVER_MOBILE = "sap_netweaver_mobile";
	public static final String SAP_NETWORKED_LOGISTICS_HUB = "sap_networked_logistics_hub";
	public static final String SAP_NOTES_MANAGEMENT = "sap_notes_management";
	public static final String SAP_OPEN_SERVER = "sap_open_server";
	public static final String SAP_OPEN_SWITCH = "sap_open_switch";
	public static final String SAP_OPERATIONAL_PROCESS_INTELLIGENCE = "sap_operational_process_intelligence";
	public static final String SAP_ORGANIZATIONAL_VISUALIZATION_BY_NAKISA = "sap_organizational_visualization_by_nakisa";
	public static final String SAP_OVERALL_EQUIPMENT_EFFECTIVENESS_MANAGEMENT = "sap_overall_equipment_effectiveness_management";
	public static final String SAP_PAYBACKS_AND_CHARGEBACKS_BY_VISTEX = "sap_paybacks_and_chargebacks_by_vistex";
	public static final String SAP_PAYMENT_APPROVALS = "sap_payment_approvals";
	public static final String SAP_PAYMENT_ENGINE = "sap_payment_engine";
	public static final String SAP_PLANT_CONNECTIVITY = "sap_plant_connectivity";
	public static final String SAP_POINTOFSALE = "sap_pointofsale";
	public static final String SAP_POLICY_MANAGEMENT = "sap_policy_management";
	public static final String SAP_PORTAL_SITE_MANAGEMENT_BY_OPENTEXT = "sap_portal_site_management_by_opentext";
	public static final String SAP_PORTFOLIO_AND_PROJECT_MANAGEMENT = "sap_portfolio_and_project_management";
	public static final String SAP_POWERBUILDER = "sap_powerbuilder";
	public static final String SAP_POWERDESIGNER = "sap_powerdesigner";
	public static final String SAP_PREDICTIVE_ANALYTICS = "sap_predictive_analytics";
	public static final String SAP_PREDICTIVE_MAINTENANCE_AND_SERVICE = "sap_predictive_maintenance_and_service";
	public static final String SAP_PRICE_AND_MARGIN_MANAGEMENT_BY_VENDAVO = "sap_price_and_margin_management_by_vendavo";
	public static final String SAP_PRICING_AND_COSTING_FOR_UTILITIES = "sap_pricing_and_costing_for_utilities";
	public static final String SAP_PROCESS_CONTROL = "sap_process_control";
	public static final String SAP_PROCESS_OBJECT_BUILDER = "sap_process_object_builder";
	public static final String SAP_PROCESS_ORCHESTRATION = "sap_process_orchestration";
	public static final String SAP_PRODUCT_LIFECYCLE_MANAGEMENT_FOR_INSURANCE = "sap_product_lifecycle_management_for_insurance";
	public static final String SAP_PRODUCTION_AND_REVENUE_ACCOUNTING = "sap_production_and_revenue_accounting";
	public static final String SAP_PROFITABILITY_AND_COST_MANAGEMENT = "sap_profitability_and_cost_management";
	public static final String SAP_PROMOTION_MANAGEMENT_FOR_RETAIL = "sap_promotion_management_for_retail";
	public static final String SAP_PUBLIC_BUDGET_FORMULATION = "sap_public_budget_formulation";
	public static final String SAP_QUALITY_CENTER_BY_HP = "sap_quality_center_by_hp";
	public static final String SAP_R3 = "sap_r3";
	public static final String SAP_REAL_ESTATE_MANAGEMENT = "sap_real_estate_management";
	public static final String SAP_REALTIME_OFFER_MANAGEMENT = "sap_realtime_offer_management";
	public static final String SAP_RECEIVABLES_MANAGER = "sap_receivables_manager";
	public static final String SAP_REGULATION_MANAGEMENT_BY_GREENLIGHT = "sap_regulation_management_by_greenlight";
	public static final String SAP_REPLICATION_SERVER = "sap_replication_server";
	public static final String SAP_RETAIL_EXECUTION = "sap_retail_execution";
	public static final String SAP_REVENUE_ACCOUNTING_AND_REPORTING = "sap_revenue_accounting_and_reporting";
	public static final String SAP_RISK_MANAGEMENT = "sap_risk_management";
	public static final String SAP_S4HANA = "sap_s4hana";
	public static final String SAP_SALES_AND_OPERATIONS_PLANNING = "sap_sales_and_operations_planning";
	public static final String SAP_SALES_COMPANION = "sap_sales_companion";
	public static final String SAP_SALES_MANAGER = "sap_sales_manager";
	public static final String SAP_SCOUTING = "sap_scouting";
	public static final String SAP_SCREEN_PERSONAS = "sap_screen_personas";
	public static final String SAP_SECONDARY_DISTRIBUTION_FOR_OIL_GAS = "sap_secondary_distribution_for_oil_gas";
	public static final String SAP_SERVICE_VIRTUALIZATION_BY_HP = "sap_service_virtualization_by_hp";
	public static final String SAP_SIMPLE_FINANCE = "sap_simple_finance";
	public static final String SAP_SINGLE_SIGNON = "sap_single_signon";
	public static final String SAP_SOLUTION_MANAGER = "sap_solution_manager";
	public static final String SAP_SOLUTIONS_FOR_COMMERCE = "sap_solutions_for_commerce";
	public static final String SAP_SOLUTIONS_FOR_FINANCE = "sap_solutions_for_finance";
	public static final String SAP_SOLUTIONS_FOR_HUMAN_RESOURCES = "sap_solutions_for_human_resources";
	public static final String SAP_SOLUTIONS_FOR_MARKETING = "sap_solutions_for_marketing";
	public static final String SAP_SOLUTIONS_FOR_SALES = "sap_solutions_for_sales";
	public static final String SAP_SOLUTIONS_FOR_SERVICE = "sap_solutions_for_service";
	public static final String SAP_SOLUTIONS_FOR_SOURCING_AND_PROCUREMENT = "sap_solutions_for_sourcing_and_procurement";
	public static final String SAP_SOURCING_AND_SAP_CONTRACT_LIFECYCLE_MANAGEMENT = "sap_sourcing_and_sap_contract_lifecycle_management";
	public static final String SAP_SPEND_PERFORMANCE_MANAGEMENT = "sap_spend_performance_management";
	public static final String SAP_SQL_ANYWHERE = "sap_sql_anywhere";
	public static final String SAP_STRATEGIC_ENTERPRISE_MANAGEMENT = "sap_strategic_enterprise_management";
	public static final String SAP_STRATEGY_MANAGEMENT = "sap_strategy_management";
	public static final String SAP_SUPPLIER_LIFECYCLE_MANAGEMENT = "sap_supplier_lifecycle_management";
	public static final String SAP_SUPPLIER_RELATIONSHIP_MANAGEMENT = "sap_supplier_relationship_management";
	public static final String SAP_SUPPLY_CHAIN_INFO_CENTER = "sap_supply_chain_info_center";
	public static final String SAP_SUPPLY_CHAIN_MANAGEMENT = "sap_supply_chain_management";
	public static final String SAP_SUPPLY_NETWORK_COLLABORATION = "sap_supply_network_collaboration";
	public static final String SAP_SUSTAINABILITY_PERFORMANCE_MANAGEMENT = "sap_sustainability_performance_management";
	public static final String SAP_TALENT_VISUALIZATION_BY_NAKISA = "sap_talent_visualization_by_nakisa";
	public static final String SAP_TAX_CLASSIFICATION_AND_REPORTING_FOR_FATCA = "sap_tax_classification_and_reporting_for_fatca";
	public static final String SAP_TAX_DECLARATION_FRAMEWORK_FOR_BRAZIL = "sap_tax_declaration_framework_for_brazil";
	public static final String SAP_TEST_ACCELERATION_AND_OPTIMIZATION = "sap_test_acceleration_and_optimization";
	public static final String SAP_TEST_DATA_MIGRATION_SERVER = "sap_test_data_migration_server";
	public static final String SAP_TRADE_PROMOTION_OPTIMIZATION = "sap_trade_promotion_optimization";
	public static final String SAP_TRANSPORT_NOTIFICATION_AND_STATUS = "sap_transport_notification_and_status";
	public static final String SAP_TRANSPORT_TENDERING = "sap_transport_tendering";
	public static final String SAP_TRANSPORTATION_MANAGEMENT = "sap_transportation_management";
	public static final String SAP_TRANSPORTATION_RESOURCE_PLANNING = "sap_transportation_resource_planning";
	public static final String SAP_TRAVEL_RECEIPTS_MANAGEMENT_BY_OPENTEXT = "sap_travel_receipts_management_by_opentext";
	public static final String SAP_UNDERWRITING_FOR_INSURANCE = "sap_underwriting_for_insurance";
	public static final String SAP_USER_EXPERIENCE_MANAGEMENT = "sap_user_experience_management";
	public static final String SAP_UTILITY_CUSTOMER_ESERVICES = "sap_utility_customer_eservices";
	public static final String SAP_VISUAL_BUSINESS = "sap_visual_business";
	public static final String SAP_WEB_IDE = "sap_web_ide";
	public static final String SAP_WORKFORCE_MANAGEMENT = "sap_workforce_management";
	public static final String SAP_WORKFORCE_PERFORMANCE_BUILDER = "sap_workforce_performance_builder";
	public static final String SAP_WORKFORCE_SCHEDULING_AND_OPTIMIZATION_BY_CLICKSOFTWARE = "sap_workforce_scheduling_and_optimization_by_clicksoftware";
	public static final String SAP_WORKING_CAPITAL_ANALYTICS = "sap_working_capital_analytics";
	public static final String SECURITY = "security";
	public static final String SELLING_THROUGH_CONTACT_CENTERS = "selling_through_contact_centers";
	public static final String SOFTWARE_LOGISTICS_TOOLSET = "software_logistics_toolset";
	public static final String SOLUTIONS_BY_LINE_OF_BUSINESS = "solutions_by_line_of_business";
	public static final String SUBSCRIPTION_BILLING_AND_REVENUE_MANAGEMENT = "subscription_billing_and_revenue_management";
	public static final String SUCCESSFACTORS_EMPLOYEE_CENTRAL = "successfactors_employee_central";
	public static final String SUCCESSFACTORS_HCM_SUITE = "successfactors_hcm_suite";
	public static final String TAXPAYER_ONLINE_SERVICES = "taxpayer_online_services";
	public static final String TWOGO_BY_SAP = "twogo_by_sap";
	public static final String UI_ADDON = "ui_addon";
	
	@Id
	private String id;
    private String name;
    
	public SapSoftwareSolution() {}

    public SapSoftwareSolution(String id) {
    	this.id = id;
    }

    public SapSoftwareSolution(String id, String name) {
    	this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "SapSoftwareSolution[id=%d, name='%s']",
                id, name);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
