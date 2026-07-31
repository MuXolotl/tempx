package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* JADX INFO: renamed from: lؙۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3733l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f7797l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public DownloaderService f7798l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f7799l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f7800l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public AudioTrack f7801l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public InterfaceC15476l f7802l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f7803l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f7804l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public DownloaderService f7805l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public /* synthetic */ Object f7806l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3733l(DownloaderService downloaderService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f7803l = downloaderService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f7806l = obj;
        this.f7797l |= RecyclerView.UNDEFINED_DURATION;
        int i = DownloaderService.f36647l;
        return this.f7803l.startapp(null, null, null, null, this);
    }
}
