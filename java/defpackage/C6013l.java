package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6013l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f12765l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f12766l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12767l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f12768l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f12769l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f12770l;

    public /* synthetic */ C6013l(InterfaceC17242l interfaceC17242l, long j, List list, int i, int i2) {
        this.f12767l = 2;
        this.f12766l = interfaceC17242l;
        this.f12765l = j;
        this.f12770l = list;
        this.f12769l = i;
        this.f12768l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12767l) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6852l.yandex((InterfaceC7316l) this.f12770l, this.f12766l, this.f12765l, (C6956l) obj, AbstractC0545l.purchase(this.f12769l | 1), this.f12768l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC11477l.yandex((AbstractC14165l) this.f12770l, this.f12766l, this.f12765l, (C6956l) obj, AbstractC0545l.purchase(this.f12769l | 1), this.f12768l);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8960l.loadAd(this.f12766l, this.f12765l, (List) this.f12770l, (C6956l) obj, AbstractC0545l.purchase(this.f12769l | 1), this.f12768l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C6013l(Object obj, InterfaceC17242l interfaceC17242l, long j, int i, int i2, int i3) {
        this.f12767l = i3;
        this.f12770l = obj;
        this.f12766l = interfaceC17242l;
        this.f12765l = j;
        this.f12769l = i;
        this.f12768l = i2;
    }
}
