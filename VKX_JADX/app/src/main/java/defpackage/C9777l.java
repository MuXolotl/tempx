package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٍٟۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9777l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13146l f19920l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f19921l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C8792l f19922l;

    public C9777l(C8792l c8792l, boolean z, C13146l c13146l) {
        this.f19922l = c8792l;
        this.f19921l = z;
        this.f19920l = c13146l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listM4213const;
        C8792l c8792l = this.f19922l;
        C7644l c7644l = c8792l.yandex;
        AbstractC3031l abstractC3031lYandex = c8792l.yandex((InterfaceC8371l) c7644l.f15734l);
        if (abstractC3031lYandex != null) {
            C0511l c0511l = (C0511l) c7644l.f15738l;
            boolean z = this.f19921l;
            C13146l c13146l = this.f19920l;
            listM4213const = z ? AbstractC16901l.m4213const(((InterfaceC0252l) c0511l.purchase).remoteconfig(abstractC3031lYandex, c13146l)) : AbstractC16901l.m4213const(((InterfaceC0252l) c0511l.purchase).isPro(abstractC3031lYandex, c13146l));
        } else {
            listM4213const = null;
        }
        return listM4213const == null ? C2580l.f5619l : listM4213const;
    }
}
