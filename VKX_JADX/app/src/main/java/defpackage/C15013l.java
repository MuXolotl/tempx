package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٟٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15013l extends AbstractC18041l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Function0 f29528l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16412l f29529l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2278l f29530l;

    public C15013l(C16412l c16412l, Function0 function0) {
        this.f29529l = c16412l;
        this.f29528l = function0;
        this.f29530l = new C2278l(c16412l, function0);
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: class */
    public final AbstractC14318l mo3847class() {
        AbstractC18041l abstractC18041lM3915static = m3915static();
        while (abstractC18041lM3915static instanceof C15013l) {
            abstractC18041lM3915static = ((C15013l) abstractC18041lM3915static).m3915static();
        }
        return (AbstractC14318l) abstractC18041lM3915static;
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: else */
    public final AbstractC18041l mo1else(C14945l c14945l) {
        return new C15013l(this.f29529l, new C11239l(c14945l, this, 6));
    }

    @Override // defpackage.AbstractC18041l
    public final List inmobi() {
        return m3915static().inmobi();
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: native */
    public final InterfaceC1925l mo1339native() {
        return m3915static().mo1339native();
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: package */
    public final C16017l mo1340package() {
        return m3915static().mo1340package();
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: public */
    public final InterfaceC7637l mo1341public() {
        return m3915static().mo1341public();
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final AbstractC18041l m3915static() {
        return (AbstractC18041l) this.f29530l.invoke();
    }

    @Override // defpackage.AbstractC18041l
    /* JADX INFO: renamed from: throw */
    public final boolean mo1342throw() {
        return m3915static().mo1342throw();
    }

    public final String toString() {
        C2278l c2278l = this.f29530l;
        return (c2278l.f18562l == EnumC12766l.f25152l || c2278l.f18562l == EnumC12766l.f25151l) ? "<Not computed yet>" : m3915static().toString();
    }
}
