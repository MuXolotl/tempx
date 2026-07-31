package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗۚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17385l implements InterfaceC7448l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC3074l f33849l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC15847l f33850l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10554l f33851l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16977l f33852l;

    public C17385l(C10554l c10554l, InterfaceC15847l interfaceC15847l) {
        this.f33851l = c10554l;
        this.f33850l = interfaceC15847l;
        this.f33849l = (InterfaceC3074l) c10554l.loadAd.invoke();
        AbstractC6903l.yandex();
        this.f33852l = new C16977l();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: case */
    public final long mo866case(float f) {
        return this.f33850l.mo866case(f);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: const */
    public final InterfaceC17792l mo1114const(int i, int i2, Map map, Function1 function1, Function1 function2) {
        return this.f33850l.mo1114const(i, i2, map, function1, function2);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: final */
    public final float mo867final(float f) {
        return this.f33850l.mo867final(f);
    }

    @Override // defpackage.InterfaceC12822l
    public final EnumC9931l getLayoutDirection() {
        return this.f33850l.getLayoutDirection();
    }

    @Override // defpackage.InterfaceC12822l
    /* JADX INFO: renamed from: import */
    public final boolean mo992import() {
        return this.f33850l.mo992import();
    }

    @Override // defpackage.InterfaceC13490l
    public final float inmobi(long j) {
        return this.f33850l.inmobi(j);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: instanceof */
    public final float mo868instanceof(float f) {
        return this.f33850l.mo868instanceof(f);
    }

    @Override // defpackage.InterfaceC7448l
    public final InterfaceC17792l isVip(int i, int i2, Map map, Function1 function1) {
        return this.f33850l.isVip(i, i2, map, function1);
    }

    @Override // defpackage.InterfaceC13490l
    public final long license(long j) {
        return this.f33850l.license(j);
    }

    @Override // defpackage.InterfaceC13490l
    public final float loadAd() {
        return this.f33850l.loadAd();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؒۢۜ */
    public final long mo869l(long j) {
        return this.f33850l.mo869l(j);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final int mo870l(float f) {
        return this.f33850l.mo870l(f);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: lٕؓٗ */
    public final float mo871l(long j) {
        return this.f33850l.mo871l(j);
    }

    @Override // defpackage.InterfaceC7448l
    /* JADX INFO: renamed from: private */
    public final InterfaceC17792l mo1115private(int i, int i2, C3006l c3006l, C3956l c3956l, Map map, C16441l c16441l) {
        return this.f33850l.mo1115private(i, i2, c3006l, c3956l, map, c16441l);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: static */
    public final float mo872static(int i) {
        return this.f33850l.mo872static(i);
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: super */
    public final float mo873super() {
        return this.f33850l.mo873super();
    }

    @Override // defpackage.InterfaceC13490l
    /* JADX INFO: renamed from: transient */
    public final int mo874transient(long j) {
        return this.f33850l.mo874transient(j);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List yandex(int i) {
        C16977l c16977l = this.f33852l;
        List list = (List) c16977l.loadAd(i);
        if (list != null) {
            return list;
        }
        InterfaceC3074l interfaceC3074l = this.f33849l;
        Object objLoadAd = interfaceC3074l.loadAd(i);
        List listAds = this.f33850l.ads(objLoadAd, this.f33851l.yandex(i, objLoadAd, interfaceC3074l.crashlytics(i)));
        c16977l.subs(i, listAds);
        return listAds;
    }
}
