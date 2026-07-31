package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٍٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9607l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f19575l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19576l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19577l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f19578l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f19579l;

    public /* synthetic */ C9607l(AbstractC18082l abstractC18082l, boolean z, Function1 function1, int i) {
        this.f19577l = 1;
        this.f19579l = abstractC18082l;
        this.f19576l = z;
        this.f19578l = function1;
        this.f19575l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19577l;
        int i2 = this.f19575l;
        boolean z = this.f19576l;
        Object obj3 = this.f19578l;
        Object obj4 = this.f19579l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iPurchase = AbstractC0545l.purchase(385);
                ((C1774l) obj4).m1046abstract(this.f19576l, this.f19575l, (InterfaceC17242l) obj3, (C6956l) obj, iPurchase);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC18037l.yandex((AbstractC18082l) obj4, z, (Function1) obj3, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iPurchase2 = AbstractC0545l.purchase(1);
                ((C18306l) obj4).m4510const((AudioTrack) obj3, this.f19576l, this.f19575l, (C6956l) obj, iPurchase2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iPurchase3 = AbstractC0545l.purchase(1);
                ((C10056l) obj4).m2873instanceof(this.f19576l, this.f19575l, (InterfaceC17242l) obj3, (C6956l) obj, iPurchase3);
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC9843l.yandex(z, (Function0) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9607l(AbstractC11801l abstractC11801l, boolean z, int i, InterfaceC17242l interfaceC17242l, int i2, int i3) {
        this.f19577l = i3;
        this.f19579l = abstractC11801l;
        this.f19576l = z;
        this.f19575l = i;
        this.f19578l = interfaceC17242l;
    }

    public /* synthetic */ C9607l(C18306l c18306l, AudioTrack audioTrack, boolean z, int i, int i2) {
        this.f19577l = 2;
        this.f19579l = c18306l;
        this.f19578l = audioTrack;
        this.f19576l = z;
        this.f19575l = i;
    }

    public /* synthetic */ C9607l(boolean z, Function0 function0, Function0 function1, int i) {
        this.f19577l = 4;
        this.f19576l = z;
        this.f19579l = function0;
        this.f19578l = function1;
        this.f19575l = i;
    }
}
