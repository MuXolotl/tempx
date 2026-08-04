package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚ٘۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7321l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0311l f15181l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15182l = 1;

    public /* synthetic */ C7321l(C0311l c0311l) {
        this.f15181l = c0311l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15182l) {
            case 0:
                ((Integer) obj2).getClass();
                this.f15181l.mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0311l c0311l = this.f15181l;
                    boolean zBooleanValue = ((Boolean) c0311l.f1358l.getValue()).booleanValue();
                    boolean zAdmob = c6956l.admob(c0311l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        C17847l c17847l = new C17847l(1, c0311l, C0311l.class, "toggleLibVkx", "toggleLibVkx(Z)V", 0, 0, 14);
                        c6956l.m2147try(c17847l);
                        objM2132native = c17847l;
                    }
                    AbstractC2021l.yandex(zBooleanValue, (Function1) ((InterfaceC5059l) objM2132native), null, false, null, c6956l, 0, 124);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C7321l(C0311l c0311l, int i) {
        this.f15181l = c0311l;
    }
}
