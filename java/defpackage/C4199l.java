package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;

/* JADX INFO: renamed from: lؖٙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4199l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f8619l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8620l;

    public /* synthetic */ C4199l(C13991l c13991l, long j) {
        this.f8620l = 0;
        this.f8619l = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        C2397l c2397l;
        Object c18435l;
        int i = this.f8620l;
        long j = this.f8619l;
        switch (i) {
            case 0:
                C1883l c1883l = (C1883l) obj;
                Long lVip = C13991l.vip(c1883l.yandex, c1883l.loadAd);
                return Boolean.valueOf(lVip != null && lVip.longValue() < j);
            case 1:
                C3366l c3366l = (C3366l) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c3366l.f7169l.admob() >> 32)) / 2.0f;
                return c3366l.yandex(new C12960l(fIntBitsToFloat, AbstractC5103l.purchase(c3366l, fIntBitsToFloat), new C0534l(j, 5), 0));
            case 2:
                C6742l c6742l = (C6742l) obj;
                c6742l.yandex();
                List listRemoteconfig = AbstractC14055l.remoteconfig(new C9735l(C9735l.loadAd(0.2f, j)), new C9735l(j));
                C13601l c13601l = c6742l.f14144l;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                C18449l c18449l = c13601l.f26629l;
                AbstractC9361l.vip(c6742l, new C6906l(listRemoteconfig, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18449l.m4551private() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18449l.m4551private() & 4294967295L)))) & 4294967295L)), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            case 3:
                C12895l c12895l = (C12895l) obj;
                Function1 function1 = c12895l.loadAd;
                if (function1 != null && (c2397l = c12895l.yandex) != null) {
                    try {
                        c18435l = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        c18435l = new C18435l(th);
                    }
                    c2397l.subs(c18435l);
                    break;
                }
                return Unit.INSTANCE;
            case 4:
                ((InterfaceC17593l) obj).amazon(AbstractC1848l.yandex, new C13620l(EnumC1826l.f4235l, this.f8619l, 2, true));
                return Unit.INSTANCE;
            case 5:
                return Long.valueOf(j);
            case 6:
                ((C16221l) obj).amazon(C4595l.loadAd, Long.valueOf(j));
                return null;
            case 7:
                C6742l c6742l2 = (C6742l) obj;
                c6742l2.yandex();
                List listRemoteconfig2 = AbstractC14055l.remoteconfig(new C9735l(C9735l.isPro), new C9735l(j));
                C13601l c13601l2 = c6742l2.f14144l;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c13601l2.f26629l.m4551private() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                C18449l c18449l2 = c13601l2.f26629l;
                AbstractC9361l.vip(c6742l2, new C6906l(listRemoteconfig2, null, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18449l2.m4551private() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18449l2.m4551private() & 4294967295L)))) & 4294967295L)), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            case 8:
                C6742l c6742l3 = (C6742l) obj;
                c6742l3.yandex();
                List listRemoteconfig3 = AbstractC14055l.remoteconfig(new C9735l(C9735l.loadAd(0.2f, j)), new C9735l(j));
                C13601l c13601l3 = c6742l3.f14144l;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c13601l3.f26629l.m4551private() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                C18449l c18449l3 = c13601l3.f26629l;
                AbstractC9361l.vip(c6742l3, new C6906l(listRemoteconfig3, null, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18449l3.m4551private() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c18449l3.m4551private() & 4294967295L)))) & 4294967295L)), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            case 9:
                ((Float) obj).getClass();
                return new C8990l(j);
            case 10:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                float fMo868instanceof = interfaceC13349l.mo868instanceof(48.0f);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fMo868instanceof)) << 32) | (((long) Float.floatToRawIntBits(fMo868instanceof)) & 4294967295L);
                long j2 = this.f8619l;
                long jLoadAd = C9735l.loadAd(0.5f, j2);
                long jLoadAd2 = C9735l.loadAd(0.25f, j2);
                AbstractC9361l.metrica(interfaceC13349l, C9735l.loadAd(0.1f, j2), 0L, 0L, 0.0f, null, null, 0, 126);
                AbstractC9361l.admob(interfaceC13349l, jLoadAd2, C14174l.amazon(interfaceC13349l.admob()), jFloatToRawIntBits4, null, 120);
                AbstractC9361l.admob(interfaceC13349l, jLoadAd, C14174l.amazon(interfaceC13349l.admob()) / 2.0f, jFloatToRawIntBits4, null, 120);
                AbstractC9361l.admob(interfaceC13349l, j2, C14174l.amazon(interfaceC13349l.admob()) / 5.0f, jFloatToRawIntBits4, null, 120);
                return Unit.INSTANCE;
            case 11:
                C3918l c3918l = (C3918l) obj;
                c3918l.m1451l(c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1)).crashlytics());
                return Boolean.TRUE;
            default:
                InterfaceC14742l interfaceC14742lMo668l = ((InterfaceC0684l) obj).mo668l("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    interfaceC14742lMo668l.firebase(1, j);
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
                        ArrayList arrayList2 = arrayList;
                        int i2 = iCrashlytics14;
                        EnumC9176l enumC9176lAdmob = AbstractC11748l.admob((int) interfaceC14742lMo668l.getLong(iCrashlytics2));
                        String strMo826implements2 = interfaceC14742lMo668l.mo826implements(iCrashlytics3);
                        String strMo826implements3 = interfaceC14742lMo668l.mo826implements(iCrashlytics4);
                        byte[] blob = interfaceC14742lMo668l.getBlob(iCrashlytics5);
                        C4279l c4279l = C4279l.loadAd;
                        C4279l c4279lLoadAd = AbstractC7280l.loadAd(blob);
                        C4279l c4279lLoadAd2 = AbstractC7280l.loadAd(interfaceC14742lMo668l.getBlob(iCrashlytics6));
                        long j3 = interfaceC14742lMo668l.getLong(iCrashlytics7);
                        long j4 = interfaceC14742lMo668l.getLong(iCrashlytics8);
                        long j5 = interfaceC14742lMo668l.getLong(iCrashlytics9);
                        int i3 = (int) interfaceC14742lMo668l.getLong(iCrashlytics10);
                        int i4 = iCrashlytics3;
                        int i5 = iCrashlytics4;
                        int iPurchase = AbstractC11748l.purchase((int) interfaceC14742lMo668l.getLong(iCrashlytics11));
                        long j6 = interfaceC14742lMo668l.getLong(iCrashlytics12);
                        long j7 = interfaceC14742lMo668l.getLong(iCrashlytics13);
                        long j8 = interfaceC14742lMo668l.getLong(i2);
                        int i6 = iCrashlytics15;
                        long j9 = interfaceC14742lMo668l.getLong(i6);
                        int i7 = iCrashlytics;
                        int i8 = iCrashlytics13;
                        int i9 = iCrashlytics16;
                        int i10 = iCrashlytics2;
                        boolean z = ((int) interfaceC14742lMo668l.getLong(i9)) != 0;
                        int i11 = iCrashlytics17;
                        int iMopub = AbstractC11748l.mopub((int) interfaceC14742lMo668l.getLong(i11));
                        int i12 = iCrashlytics18;
                        int i13 = (int) interfaceC14742lMo668l.getLong(i12);
                        int i14 = iCrashlytics19;
                        int i15 = (int) interfaceC14742lMo668l.getLong(i14);
                        int i16 = iCrashlytics20;
                        long j10 = interfaceC14742lMo668l.getLong(i16);
                        int i17 = iCrashlytics21;
                        int i18 = (int) interfaceC14742lMo668l.getLong(i17);
                        int i19 = iCrashlytics22;
                        int i20 = (int) interfaceC14742lMo668l.getLong(i19);
                        int i21 = iCrashlytics23;
                        String strMo826implements4 = interfaceC14742lMo668l.isNull(i21) ? null : interfaceC14742lMo668l.mo826implements(i21);
                        int i22 = iCrashlytics24;
                        Integer numValueOf = interfaceC14742lMo668l.isNull(i22) ? null : Integer.valueOf((int) interfaceC14742lMo668l.getLong(i22));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i23 = iCrashlytics25;
                        int iBilling = AbstractC11748l.billing((int) interfaceC14742lMo668l.getLong(i23));
                        int i24 = iCrashlytics26;
                        C8891l c8891lRemoteconfig = AbstractC11748l.remoteconfig(interfaceC14742lMo668l.getBlob(i24));
                        iCrashlytics25 = i23;
                        iCrashlytics26 = i24;
                        int i25 = iCrashlytics27;
                        boolean z2 = ((int) interfaceC14742lMo668l.getLong(i25)) != 0;
                        iCrashlytics27 = i25;
                        int i26 = iCrashlytics28;
                        boolean z3 = ((int) interfaceC14742lMo668l.getLong(i26)) != 0;
                        int i27 = iCrashlytics29;
                        boolean z4 = ((int) interfaceC14742lMo668l.getLong(i27)) != 0;
                        iCrashlytics29 = i27;
                        int i28 = iCrashlytics30;
                        int i29 = iCrashlytics31;
                        int i30 = iCrashlytics32;
                        int i31 = iCrashlytics33;
                        iCrashlytics33 = i31;
                        arrayList2.add(new C7718l(strMo826implements, enumC9176lAdmob, strMo826implements2, strMo826implements3, c4279lLoadAd, c4279lLoadAd2, j3, j4, j5, new C13152l(c8891lRemoteconfig, iBilling, z2, z3, z4, ((int) interfaceC14742lMo668l.getLong(i28)) != 0, interfaceC14742lMo668l.getLong(i29), interfaceC14742lMo668l.getLong(i30), AbstractC11748l.yandex(interfaceC14742lMo668l.getBlob(i31))), i3, iPurchase, j6, j7, j8, j9, z, iMopub, i13, i15, j10, i18, i20, strMo826implements4, boolValueOf));
                        iCrashlytics30 = i28;
                        iCrashlytics3 = i4;
                        iCrashlytics14 = i2;
                        iCrashlytics17 = i11;
                        iCrashlytics19 = i14;
                        iCrashlytics22 = i19;
                        iCrashlytics24 = i22;
                        arrayList = arrayList2;
                        iCrashlytics31 = i29;
                        iCrashlytics32 = i30;
                        iCrashlytics13 = i8;
                        iCrashlytics = i7;
                        iCrashlytics2 = i10;
                        iCrashlytics15 = i6;
                        iCrashlytics16 = i9;
                        iCrashlytics20 = i16;
                        iCrashlytics21 = i17;
                        iCrashlytics23 = i21;
                        iCrashlytics18 = i12;
                        iCrashlytics28 = i26;
                        iCrashlytics4 = i5;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC14742lMo668l.close();
                }
        }
    }

    public /* synthetic */ C4199l(long j, int i) {
        this.f8620l = i;
        this.f8619l = j;
    }
}
