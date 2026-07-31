package defpackage;

import android.os.Trace;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lؓۤؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2218l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f4894l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4895l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4896l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4897l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f4898l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4899l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f4900l;

    public /* synthetic */ RunnableC2218l(C11644l c11644l, InterfaceC18690l interfaceC18690l, InterfaceC18690l interfaceC18690l2, C3716l c3716l, C3716l c3716l2, Map.Entry entry) {
        this.f4896l = c11644l;
        this.f4894l = interfaceC18690l;
        this.f4899l = interfaceC18690l2;
        this.f4898l = c3716l;
        this.f4900l = c3716l2;
        this.f4895l = entry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1852l c1852lAppmetrica;
        int i = this.f4897l;
        Object obj = this.f4895l;
        Object obj2 = this.f4900l;
        Object obj3 = this.f4898l;
        Object obj4 = this.f4899l;
        Object obj5 = this.f4894l;
        Object obj6 = this.f4896l;
        switch (i) {
            case 0:
                C11090l c11090l = (C11090l) obj6;
                EnumC9931l enumC9931l = (EnumC9931l) obj5;
                List list = (List) obj4;
                C3625l c3625l = (C3625l) obj3;
                InterfaceC13490l interfaceC13490l = (InterfaceC13490l) obj2;
                InterfaceC16061l interfaceC16061l = (InterfaceC16061l) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
                    C1852l c1852l = abstractC18620lIsPro instanceof C1852l ? (C1852l) abstractC18620lIsPro : null;
                    if (c1852l == null || (c1852lAppmetrica = c1852l.appmetrica(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC18620l abstractC18620lIsPro2 = c1852lAppmetrica.isPro();
                        try {
                            C11090l c11090lCrashlytics = AbstractC7709l.crashlytics(c11090l, enumC9931l);
                            if (list == null) {
                                list = C2580l.f5619l;
                            }
                            C11644l c11644l = new C11644l(c3625l, c11090lCrashlytics, list, interfaceC13490l, interfaceC16061l);
                            c11644l.mo1547l();
                            c11644l.mo1546l();
                            Unit unit = Unit.INSTANCE;
                            AbstractC18620l.adcel(abstractC18620lIsPro2);
                            c1852lAppmetrica.pro().yandex();
                            c1852lAppmetrica.crashlytics();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            AbstractC18620l.adcel(abstractC18620lIsPro2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            c1852lAppmetrica.crashlytics();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            default:
                ((C11644l) obj6).m3149l((InterfaceC18690l) obj5, (InterfaceC18690l) obj4, (C3716l) obj3, (C3716l) obj2, (Map.Entry) obj);
                return;
        }
    }

    public /* synthetic */ RunnableC2218l(C11090l c11090l, EnumC9931l enumC9931l, List list, C3625l c3625l, InterfaceC13490l interfaceC13490l, InterfaceC16061l interfaceC16061l, boolean z) {
        this.f4896l = c11090l;
        this.f4894l = enumC9931l;
        this.f4899l = list;
        this.f4898l = c3625l;
        this.f4900l = interfaceC13490l;
        this.f4895l = interfaceC16061l;
    }
}
