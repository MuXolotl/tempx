package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4119l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8486l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8487l;

    public /* synthetic */ C4119l(int i, int i2) {
        this.f8487l = i2;
        this.f8486l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.f8487l;
        int i2 = this.f8486l;
        switch (i) {
            case 0:
                InterfaceC18362l interfaceC18362l = (InterfaceC18362l) obj;
                return interfaceC18362l.yandex(AbstractC6363l.purchase(i2, ((EnumC3830l) interfaceC18362l.amazon()).ordinal() > ((EnumC3830l) interfaceC18362l.loadAd()).ordinal()), AbstractC7741l.billing(2));
            case 1:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 2:
                InterfaceC18362l interfaceC18362l2 = (InterfaceC18362l) obj;
                return AbstractC6363l.amazon(i2, ((EnumC9157l) ((AbstractC5357l) interfaceC18362l2.loadAd()).yandex()).ordinal() < ((EnumC9157l) ((AbstractC5357l) interfaceC18362l2.amazon()).yandex()).ordinal());
            case 3:
                InterfaceC18362l interfaceC18362l3 = (InterfaceC18362l) obj;
                return interfaceC18362l3.yandex(((Boolean) interfaceC18362l3.amazon()).booleanValue() ? AbstractC6363l.purchase(i2, true) : AbstractC6363l.purchase(i2, false), AbstractC7741l.billing(2));
            case 4:
                InterfaceC18362l interfaceC18362l4 = (InterfaceC18362l) obj;
                return interfaceC18362l4.yandex(((Boolean) interfaceC18362l4.amazon()).booleanValue() ? AbstractC6363l.purchase(i2, true) : AbstractC6363l.purchase(i2, false), AbstractC7741l.billing(2));
            case 5:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 6:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            default:
                InterfaceC14742l interfaceC14742lMo668l = ((InterfaceC0684l) obj).mo668l("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    interfaceC14742lMo668l.firebase(1, i2);
                    int iCrashlytics = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "id");
                    int iCrashlytics2 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "state");
                    int iCrashlytics3 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "worker_class_name");
                    int iCrashlytics4 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "input_merger_class_name");
                    int iCrashlytics5 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "input");
                    int iCrashlytics6 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "output");
                    int iCrashlytics7 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "initial_delay");
                    int iCrashlytics8 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "interval_duration");
                    int iCrashlytics9 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "flex_duration");
                    int iCrashlytics10 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "run_attempt_count");
                    int iCrashlytics11 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "backoff_policy");
                    int iCrashlytics12 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "backoff_delay_duration");
                    int iCrashlytics13 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "last_enqueue_time");
                    int iCrashlytics14 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "minimum_retention_duration");
                    int iCrashlytics15 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "schedule_requested_at");
                    int iCrashlytics16 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "run_in_foreground");
                    int iCrashlytics17 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "out_of_quota_policy");
                    int iCrashlytics18 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "period_count");
                    int iCrashlytics19 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "generation");
                    int iCrashlytics20 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "next_schedule_time_override");
                    int iCrashlytics21 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "next_schedule_time_override_generation");
                    int iCrashlytics22 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "stop_reason");
                    int iCrashlytics23 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "trace_tag");
                    int iCrashlytics24 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "backoff_on_system_interruptions");
                    int iCrashlytics25 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "required_network_type");
                    int iCrashlytics26 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "required_network_request");
                    int iCrashlytics27 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "requires_charging");
                    int iCrashlytics28 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "requires_device_idle");
                    int iCrashlytics29 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "requires_battery_not_low");
                    int iCrashlytics30 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "requires_storage_not_low");
                    int iCrashlytics31 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "trigger_content_update_delay");
                    int iCrashlytics32 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "trigger_max_content_delay");
                    int iCrashlytics33 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC14742lMo668l.mo827l()) {
                        String strMo826implements = interfaceC14742lMo668l.mo826implements(iCrashlytics);
                        int i3 = iCrashlytics12;
                        int i4 = iCrashlytics13;
                        EnumC9176l enumC9176lAdmob = AbstractC11748l.admob((int) interfaceC14742lMo668l.getLong(iCrashlytics2));
                        String strMo826implements2 = interfaceC14742lMo668l.mo826implements(iCrashlytics3);
                        String strMo826implements3 = interfaceC14742lMo668l.mo826implements(iCrashlytics4);
                        byte[] blob = interfaceC14742lMo668l.getBlob(iCrashlytics5);
                        C4279l c4279l = C4279l.loadAd;
                        C4279l c4279lLoadAd = AbstractC7280l.loadAd(blob);
                        C4279l c4279lLoadAd2 = AbstractC7280l.loadAd(interfaceC14742lMo668l.getBlob(iCrashlytics6));
                        long j = interfaceC14742lMo668l.getLong(iCrashlytics7);
                        long j2 = interfaceC14742lMo668l.getLong(iCrashlytics8);
                        long j3 = interfaceC14742lMo668l.getLong(iCrashlytics9);
                        int i5 = (int) interfaceC14742lMo668l.getLong(iCrashlytics10);
                        int i6 = iCrashlytics3;
                        int i7 = iCrashlytics4;
                        int iPurchase = AbstractC11748l.purchase((int) interfaceC14742lMo668l.getLong(iCrashlytics11));
                        long j4 = interfaceC14742lMo668l.getLong(i3);
                        long j5 = interfaceC14742lMo668l.getLong(i4);
                        long j6 = interfaceC14742lMo668l.getLong(iCrashlytics14);
                        int i8 = iCrashlytics;
                        int i9 = iCrashlytics15;
                        long j7 = interfaceC14742lMo668l.getLong(i9);
                        iCrashlytics15 = i9;
                        int i10 = iCrashlytics14;
                        int i11 = iCrashlytics16;
                        int i12 = iCrashlytics2;
                        boolean z = ((int) interfaceC14742lMo668l.getLong(i11)) != 0;
                        int i13 = iCrashlytics17;
                        int iMopub = AbstractC11748l.mopub((int) interfaceC14742lMo668l.getLong(i13));
                        int i14 = iCrashlytics18;
                        int i15 = (int) interfaceC14742lMo668l.getLong(i14);
                        int i16 = iCrashlytics19;
                        int i17 = (int) interfaceC14742lMo668l.getLong(i16);
                        int i18 = iCrashlytics20;
                        long j8 = interfaceC14742lMo668l.getLong(i18);
                        int i19 = iCrashlytics21;
                        int i20 = (int) interfaceC14742lMo668l.getLong(i19);
                        int i21 = iCrashlytics22;
                        int i22 = (int) interfaceC14742lMo668l.getLong(i21);
                        int i23 = iCrashlytics23;
                        Boolean boolValueOf = null;
                        String strMo826implements4 = interfaceC14742lMo668l.isNull(i23) ? null : interfaceC14742lMo668l.mo826implements(i23);
                        int i24 = iCrashlytics24;
                        Integer numValueOf = interfaceC14742lMo668l.isNull(i24) ? null : Integer.valueOf((int) interfaceC14742lMo668l.getLong(i24));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i25 = iCrashlytics25;
                        Boolean bool = boolValueOf;
                        int iBilling = AbstractC11748l.billing((int) interfaceC14742lMo668l.getLong(i25));
                        int i26 = iCrashlytics26;
                        C8891l c8891lRemoteconfig = AbstractC11748l.remoteconfig(interfaceC14742lMo668l.getBlob(i26));
                        iCrashlytics25 = i25;
                        int i27 = iCrashlytics27;
                        boolean z2 = ((int) interfaceC14742lMo668l.getLong(i27)) != 0;
                        iCrashlytics27 = i27;
                        int i28 = iCrashlytics28;
                        boolean z3 = ((int) interfaceC14742lMo668l.getLong(i28)) != 0;
                        iCrashlytics28 = i28;
                        int i29 = iCrashlytics29;
                        boolean z4 = ((int) interfaceC14742lMo668l.getLong(i29)) != 0;
                        iCrashlytics29 = i29;
                        int i30 = iCrashlytics30;
                        int i31 = iCrashlytics31;
                        int i32 = iCrashlytics32;
                        int i33 = iCrashlytics33;
                        arrayList.add(new C7718l(strMo826implements, enumC9176lAdmob, strMo826implements2, strMo826implements3, c4279lLoadAd, c4279lLoadAd2, j, j2, j3, new C13152l(c8891lRemoteconfig, iBilling, z2, z3, z4, ((int) interfaceC14742lMo668l.getLong(i30)) != 0, interfaceC14742lMo668l.getLong(i31), interfaceC14742lMo668l.getLong(i32), AbstractC11748l.yandex(interfaceC14742lMo668l.getBlob(i33))), i5, iPurchase, j4, j5, j6, j7, z, iMopub, i15, i17, j8, i20, i22, strMo826implements4, bool));
                        iCrashlytics33 = i33;
                        iCrashlytics31 = i31;
                        iCrashlytics32 = i32;
                        iCrashlytics3 = i6;
                        iCrashlytics13 = i4;
                        iCrashlytics12 = i3;
                        iCrashlytics18 = i14;
                        iCrashlytics19 = i16;
                        iCrashlytics21 = i19;
                        iCrashlytics23 = i23;
                        iCrashlytics = i8;
                        iCrashlytics4 = i7;
                        iCrashlytics17 = i13;
                        iCrashlytics26 = i26;
                        iCrashlytics2 = i12;
                        iCrashlytics16 = i11;
                        iCrashlytics20 = i18;
                        iCrashlytics22 = i21;
                        iCrashlytics24 = i24;
                        iCrashlytics30 = i30;
                        iCrashlytics14 = i10;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC14742lMo668l.close();
                }
        }
    }
}
