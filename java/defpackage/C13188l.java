package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13188l implements InterfaceC15476l, InterfaceC13280l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f25798l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f25799l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C4391l f25800l;

    public C13188l(C4391l c4391l, ArrayList arrayList, boolean z) {
        this.f25800l = null;
        new ArrayList();
        this.f25800l = c4391l;
        this.f25799l = arrayList;
        this.f25798l = z;
    }

    @Override // defpackage.InterfaceC15476l
    public final int amazon() {
        return this.f25799l.size() + this.f25800l.amazon();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC15476l
    public final AbstractC1186l crashlytics(EnumC17969l enumC17969l) {
        EnumC17969l enumC17969l2 = EnumC17969l.COVER_ART;
        if (!enumC17969l2.equals(enumC17969l2)) {
            return this.f25800l.crashlytics(enumC17969l2);
        }
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        c16971lMetrica.amazon(this.f25799l);
        return c16971lMetrica.mopub();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l firebase(EnumC17969l enumC17969l, String... strArr) {
        if (enumC17969l != EnumC17969l.ALBUM_ARTIST) {
            remoteconfig(yandex(enumC17969l, strArr));
            return this;
        }
        C6356l.amazon();
        remoteconfig(yandex(enumC17969l, (String) AbstractC6745l.crashlytics(strArr)));
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean isEmpty() {
        C4391l c4391l = this.f25800l;
        return (c4391l == null || c4391l.isEmpty()) && this.f25799l.size() == 0;
    }

    @Override // defpackage.InterfaceC15476l
    public final Iterator isPro() {
        return this.f25800l.isPro();
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean loadAd() {
        return this.f25798l;
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC15476l metrica(AbstractC5859l abstractC5859l) {
        AbstractC6745l.loadAd(abstractC5859l, "artwork");
        remoteconfig(smaato(abstractC5859l));
        return this;
    }

    @Override // defpackage.InterfaceC15476l
    public final boolean mopub(EnumC17969l enumC17969l) {
        if (enumC17969l == EnumC17969l.COVER_ART) {
            return this.f25799l.size() > 0;
        }
        return this.f25800l.mopub(enumC17969l);
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l purchase(EnumC17969l enumC17969l) {
        if (EnumC17969l.COVER_ART.equals(enumC17969l)) {
            throw new C6451l(enumC17969l.name(), 18, (byte) 0);
        }
        return this.f25800l.purchase(enumC17969l);
    }

    @Override // defpackage.InterfaceC13280l
    public final void remoteconfig(InterfaceC4656l interfaceC4656l) {
        if (!(interfaceC4656l instanceof C1562l)) {
            this.f25800l.remoteconfig(interfaceC4656l);
            return;
        }
        ArrayList arrayList = this.f25799l;
        if (arrayList.size() == 0) {
            arrayList.add(0, (C1562l) interfaceC4656l);
        } else {
            arrayList.set(0, (C1562l) interfaceC4656l);
        }
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l smaato(AbstractC5859l abstractC5859l) throws C9706l {
        abstractC5859l.getClass();
        if (abstractC5859l.yandex()) {
            return new C1562l(abstractC5859l.yandex, abstractC5859l.crashlytics, abstractC5859l.loadAd, abstractC5859l.amazon, abstractC5859l.purchase);
        }
        throw new C9706l("Unable to createField buffered image from the image");
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC17238l subs(EnumC17969l enumC17969l) {
        return purchase(enumC17969l);
    }

    public final String toString() {
        return "FLAC " + this.f25800l;
    }

    @Override // defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        this.f25800l.getClass();
        return C4391l.f8922l.keySet();
    }

    @Override // defpackage.InterfaceC15476l
    public final InterfaceC4656l yandex(EnumC17969l enumC17969l, String... strArr) {
        if (enumC17969l.equals(EnumC17969l.COVER_ART)) {
            throw new C6451l(enumC17969l.name(), 18, (byte) 0);
        }
        return this.f25800l.yandex(enumC17969l, strArr);
    }
}
