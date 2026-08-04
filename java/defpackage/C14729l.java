package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* JADX INFO: renamed from: lؙٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14729l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f28802l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AbstractC7317l f28803l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f28804l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public File f28805l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f28806l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Integer f28807l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f28808l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public String f28809l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public AudioTrack f28810l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public /* synthetic */ Object f28811l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14729l(DownloaderService downloaderService, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f28808l = downloaderService;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f28811l = obj;
        this.f28802l |= RecyclerView.UNDEFINED_DURATION;
        return DownloaderService.isPro(this.f28808l, null, null, null, null, null, null, this);
    }
}
