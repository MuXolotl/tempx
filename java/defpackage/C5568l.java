package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؘِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5568l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f11845l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f11846l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11847l;

    public /* synthetic */ C5568l(int i, String str) {
        this.f11847l = 3;
        this.f11845l = i;
        this.f11846l = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        C11059l c11059l;
        int i = this.f11847l;
        String str = this.f11846l;
        int i2 = this.f11845l;
        switch (i) {
            case 0:
                C2566l c2566l = (C2566l) obj;
                C12814l c12814l = c2566l.f5578l;
                if (c12814l != null) {
                    long j = c12814l.yandex;
                    AbstractC12272l.billing(c2566l, (int) (j >> 32), (int) (j & 4294967295L), str);
                } else {
                    AbstractC12272l.billing(c2566l, C12814l.mopub(c2566l.f5585l), C12814l.billing(c2566l.f5585l), str);
                }
                int iMopub = C12814l.mopub(c2566l.f5585l);
                int iPurchase = AbstractC8576l.purchase(i2 > 0 ? (iMopub + i2) - 1 : (iMopub + i2) - str.length(), 0, c2566l.f5577l.length());
                c2566l.mopub(AbstractC2296l.loadAd(iPurchase, iPurchase));
                return Unit.INSTANCE;
            case 1:
                InterfaceC14742l interfaceC14742lMo668l = ((InterfaceC0684l) obj).mo668l("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    interfaceC14742lMo668l.mo824final(1, str);
                    interfaceC14742lMo668l.firebase(2, i2);
                    int iCrashlytics = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "work_spec_id");
                    int iCrashlytics2 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "generation");
                    int iCrashlytics3 = AbstractC8513l.crashlytics(interfaceC14742lMo668l, "system_id");
                    if (interfaceC14742lMo668l.mo827l()) {
                        c11059l = new C11059l(interfaceC14742lMo668l.mo826implements(iCrashlytics), (int) interfaceC14742lMo668l.getLong(iCrashlytics2), (int) interfaceC14742lMo668l.getLong(iCrashlytics3));
                        break;
                    } else {
                        c11059l = null;
                    }
                    return c11059l;
                } finally {
                    interfaceC14742lMo668l.close();
                }
            case 2:
                InterfaceC14742l interfaceC14742lMo668l2 = ((InterfaceC0684l) obj).mo668l("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    interfaceC14742lMo668l2.mo824final(1, str);
                    interfaceC14742lMo668l2.firebase(2, i2);
                    interfaceC14742lMo668l2.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l2.close();
                }
            default:
                InterfaceC14742l interfaceC14742lMo668l3 = ((InterfaceC0684l) obj).mo668l("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    interfaceC14742lMo668l3.firebase(1, i2);
                    interfaceC14742lMo668l3.mo824final(2, str);
                    interfaceC14742lMo668l3.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l3.close();
                }
        }
    }

    public /* synthetic */ C5568l(String str, int i, int i2) {
        this.f11847l = i2;
        this.f11846l = str;
        this.f11845l = i;
    }
}
