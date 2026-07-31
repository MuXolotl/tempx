package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15679l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6347l f30809l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30810l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30811l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f30812l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30813l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C7224l f30814l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C12654l f30815l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f30816l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C5028l f30817l;

    public /* synthetic */ C15679l(InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, C12654l c12654l, C7224l c7224l, C5028l c5028l, Function3 function3, int i, int i2, int i3) {
        this.f30813l = i3;
        this.f30812l = interfaceC17242l;
        this.f30809l = interfaceC6347l;
        this.f30815l = c12654l;
        this.f30814l = c7224l;
        this.f30817l = c5028l;
        this.f30816l = function3;
        this.f30810l = i;
        this.f30811l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30813l;
        int i2 = this.f30810l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3383l.amazon(this.f30812l, this.f30809l, this.f30815l, this.f30814l, this.f30817l, (C15578l) this.f30816l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), this.f30811l);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC3383l.yandex(this.f30812l, this.f30809l, this.f30815l, this.f30814l, this.f30817l, this.f30816l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), this.f30811l);
                break;
        }
        return Unit.INSTANCE;
    }
}
