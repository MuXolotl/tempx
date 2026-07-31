package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٖؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16143l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f31609l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ long f31610l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31611l;

    public /* synthetic */ C16143l(long j, String str, int i) {
        this.f31611l = i;
        this.f31610l = j;
        this.f31609l = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.f31611l;
        String str = this.f31609l;
        long j = this.f31610l;
        switch (i) {
            case 0:
                InterfaceC0684l interfaceC0684l = (InterfaceC0684l) obj;
                InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    interfaceC14742lMo668l.firebase(1, j);
                    interfaceC14742lMo668l.mo824final(2, str);
                    interfaceC14742lMo668l.mo827l();
                    return Integer.valueOf(AbstractC16837l.crashlytics(interfaceC0684l));
                } finally {
                    interfaceC14742lMo668l.close();
                }
            default:
                InterfaceC14742l interfaceC14742lMo668l2 = ((InterfaceC0684l) obj).mo668l("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    interfaceC14742lMo668l2.firebase(1, j);
                    interfaceC14742lMo668l2.mo824final(2, str);
                    interfaceC14742lMo668l2.mo827l();
                    return Unit.INSTANCE;
                } finally {
                    interfaceC14742lMo668l2.close();
                }
        }
    }
}
