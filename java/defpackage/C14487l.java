package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؚٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14487l extends AbstractC15211l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7662l f28361l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String[] f28362l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final String f28363l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC1925l f28364l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final List f28365l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final EnumC5123l f28366l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f28367l;

    public C14487l(InterfaceC1925l interfaceC1925l, C7662l c7662l, EnumC5123l enumC5123l, List list, boolean z, String... strArr) {
        this.f28364l = interfaceC1925l;
        this.f28361l = c7662l;
        this.f28366l = enumC5123l;
        this.f28365l = list;
        this.f28367l = z;
        this.f28362l = strArr;
        String str = enumC5123l.f11153l;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f28363l = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: implements */
    public final AbstractC15211l mo8static(boolean z) {
        String[] strArr = this.f28362l;
        return new C14487l(this.f28364l, this.f28361l, this.f28366l, this.f28365l, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.AbstractC18041l
    public final List inmobi() {
        return this.f28365l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: native */
    public final InterfaceC1925l mo1339native() {
        return this.f28364l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: package */
    public final C16017l mo1340package() {
        C16017l.f31395l.getClass();
        return C16017l.f31394l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: public */
    public final InterfaceC7637l mo1341public() {
        return this.f28361l;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1342throw() {
        return this.f28367l;
    }

    @Override // defpackage.AbstractC15211l, defpackage.AbstractC14318l
    /* JADX INFO: renamed from: abstract */
    public final AbstractC14318l mo686abstract(C16017l c16017l) {
        return this;
    }

    @Override // defpackage.AbstractC14318l
    /* JADX INFO: renamed from: default */
    public final AbstractC14318l mo0default(C14945l c14945l) {
        return this;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: else */
    public final AbstractC18041l mo1else(C14945l c14945l) {
        return this;
    }

    @Override // defpackage.AbstractC15211l
    /* JADX INFO: renamed from: lؔٙؕ */
    public final AbstractC15211l mo686abstract(C16017l c16017l) {
        return this;
    }
}
