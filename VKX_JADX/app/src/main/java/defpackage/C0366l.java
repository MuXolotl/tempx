package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* JADX INFO: renamed from: lؑٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0366l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f1436l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f1437l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f1438l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f1439l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f1440l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public File f1441l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0366l(DownloaderService downloaderService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f1437l = downloaderService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f1436l = obj;
        this.f1440l |= RecyclerView.UNDEFINED_DURATION;
        int i = DownloaderService.f36647l;
        return this.f1437l.firebase(null, null, this);
    }
}
