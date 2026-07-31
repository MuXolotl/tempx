package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.Concert;

/* JADX INFO: renamed from: lٍۨؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9976l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f20367l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f20368l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20369l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f20370l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f20371l;

    public /* synthetic */ C9976l(InterfaceC12001l interfaceC12001l, int i, C15578l c15578l, int i2, int i3) {
        this.f20369l = 1;
        this.f20371l = interfaceC12001l;
        this.f20368l = i;
        this.f20370l = c15578l;
        this.f20367l = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20369l;
        int i2 = this.f20367l;
        int i3 = this.f20368l;
        Object obj3 = this.f20370l;
        Object obj4 = this.f20371l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3836l.yandex((Concert) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(i3 | 1), i2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(3073);
                AbstractC3872l.yandex((InterfaceC12001l) obj4, this.f20368l, (C15578l) obj3, (C6956l) obj, iPurchase, this.f20367l);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((C11446l) obj4).smaato((Function2) obj3, (C6956l) obj, AbstractC0545l.purchase(i3 | 1), i2);
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC15918l.yandex((Function0) obj4, (C0247l) obj3, i3, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9976l(Object obj, Object obj2, int i, int i2, int i3) {
        this.f20369l = i3;
        this.f20371l = obj;
        this.f20370l = obj2;
        this.f20368l = i;
        this.f20367l = i2;
    }
}
