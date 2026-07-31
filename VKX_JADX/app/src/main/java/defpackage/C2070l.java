package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؓۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2070l extends AbstractC9707l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f4604l = {new C0544l(C2070l.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new C0544l(C2070l.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f4605l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f4606l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC1112l f4607l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2343l f4608l;

    public C2070l(AbstractC1112l abstractC1112l, int i, int i2, Function0 function0) {
        this.f4607l = abstractC1112l;
        this.f4606l = i;
        this.f4605l = i2;
        this.f4608l = AbstractC3124l.loadAd(null, function0);
        AbstractC3124l.loadAd(null, new C15326l(this, 0));
    }

    @Override // defpackage.AbstractC9707l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final boolean mo1106extends() {
        InterfaceC12657l interfaceC12657lM1107for = m1107for();
        return (interfaceC12657lM1107for instanceof C17538l) && ((C17538l) interfaceC12657lM1107for).f34151l != null;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final InterfaceC12657l m1107for() {
        InterfaceC13922l interfaceC13922l = f4604l[0];
        return (InterfaceC12657l) this.f4608l.invoke();
    }

    @Override // defpackage.AbstractC9707l
    public final String getName() {
        InterfaceC12657l interfaceC12657lM1107for = m1107for();
        C17538l c17538l = interfaceC12657lM1107for instanceof C17538l ? (C17538l) interfaceC12657lM1107for : null;
        if (c17538l != null && !c17538l.m4402l().mo1473for()) {
            C3498l name = c17538l.getName();
            if (!name.f7383l) {
                return name.loadAd();
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC9707l
    public final int premium() {
        return this.f4605l;
    }

    @Override // defpackage.AbstractC9707l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final boolean mo1108private() {
        InterfaceC12657l interfaceC12657lM1107for = m1107for();
        C17538l c17538l = interfaceC12657lM1107for instanceof C17538l ? (C17538l) interfaceC12657lM1107for : null;
        if (c17538l != null) {
            return AbstractC3759l.yandex(c17538l);
        }
        return false;
    }

    @Override // defpackage.AbstractC9707l
    public final int pro() {
        return this.f4606l;
    }

    @Override // defpackage.AbstractC9707l
    public final boolean remoteconfig() {
        InterfaceC12657l interfaceC12657lM1107for = m1107for();
        C17538l c17538l = interfaceC12657lM1107for instanceof C17538l ? (C17538l) interfaceC12657lM1107for : null;
        return c17538l != null && c17538l.m4403l();
    }

    @Override // defpackage.AbstractC9707l
    public final InterfaceC18672l subs() {
        return this.f4607l;
    }

    @Override // defpackage.AbstractC9707l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final InterfaceC13012l mo1109synchronized() {
        C5380l c5380l = new C5380l(m1107for().yandex(), new C15326l(this, 1), false);
        AbstractC1112l abstractC1112l = this.f4607l;
        InterfaceC13012l interfaceC13012l = abstractC1112l.f3046l.loadAd.yandex(1, c5380l).loadAd;
        if (interfaceC13012l != null) {
            return interfaceC13012l;
        }
        AbstractC4769l.billing(abstractC1112l);
        throw null;
    }
}
