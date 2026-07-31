package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;

/* JADX INFO: renamed from: lٍؘؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5485l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f11735l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f11736l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11737l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f11738l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11739l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f11740l;

    public /* synthetic */ C5485l(C0483l c0483l, boolean z, Function1 function1, C15578l c15578l, int i) {
        this.f11737l = 0;
        this.f11739l = c0483l;
        this.f11736l = z;
        this.f11738l = function1;
        this.f11740l = c15578l;
        this.f11735l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11737l;
        int i2 = this.f11735l;
        Object obj3 = this.f11740l;
        Object obj4 = this.f11738l;
        Object obj5 = this.f11739l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(i2 | 1);
                ((C0483l) obj5).smaato(this.f11736l, (Function1) obj4, (C15578l) obj3, (C6956l) obj, iPurchase);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(i2 | 1);
                AbstractC12225l.yandex((AudioContentCard) obj5, (Function0) obj4, (Function0) obj3, this.f11736l, (C6956l) obj, iPurchase2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(i2 | 1);
                ((C4456l) obj5).pro((C14843l) obj4, this.f11736l, (InterfaceC17242l) obj3, (C6956l) obj, iPurchase3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iPurchase4 = AbstractC0545l.purchase(i2 | 1);
                ((C4456l) obj5).isVip((C4587l) obj4, this.f11736l, (InterfaceC17242l) obj3, (C6956l) obj, iPurchase4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iPurchase5 = AbstractC0545l.purchase(1);
                AbstractC2991l.purchase((C4348l) obj5, this.f11736l, (Function1) obj4, (Function1) obj3, (C6956l) obj, iPurchase5, this.f11735l);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5485l(C4456l c4456l, Object obj, boolean z, InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f11737l = i2;
        this.f11739l = c4456l;
        this.f11738l = obj;
        this.f11736l = z;
        this.f11740l = interfaceC17242l;
        this.f11735l = i;
    }

    public /* synthetic */ C5485l(C4348l c4348l, boolean z, Function1 function1, Function1 function2, int i, int i2) {
        this.f11737l = 4;
        this.f11739l = c4348l;
        this.f11736l = z;
        this.f11738l = function1;
        this.f11740l = function2;
        this.f11735l = i2;
    }

    public /* synthetic */ C5485l(AudioContentCard audioContentCard, Function0 function0, Function0 function1, boolean z, int i) {
        this.f11737l = 1;
        this.f11739l = audioContentCard;
        this.f11738l = function0;
        this.f11740l = function1;
        this.f11736l = z;
        this.f11735l = i;
    }
}
