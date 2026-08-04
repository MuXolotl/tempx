package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* JADX INFO: renamed from: lٔۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15186l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC15476l f29773l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f29774l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f29775l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public AbstractC5859l f29776l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC5859l f29777l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f29778l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AbstractC5859l f29779l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15186l(DownloaderService downloaderService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f29778l = downloaderService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f29774l = obj;
        this.f29775l |= RecyclerView.UNDEFINED_DURATION;
        int i = DownloaderService.f36647l;
        return this.f29778l.adcel(null, null, this);
    }
}
