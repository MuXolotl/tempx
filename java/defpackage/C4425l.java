package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4425l extends AbstractC16377l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9012l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4425l(AbstractServiceC5477l abstractServiceC5477l, int i) {
        super(abstractServiceC5477l);
        this.f9012l = i;
    }

    @Override // defpackage.AbstractC16377l
    public final String admob() {
        switch (this.f9012l) {
            case 0:
                return "Кеширование";
            default:
                return "Скачивание";
        }
    }

    @Override // defpackage.AbstractC16377l
    public final int crashlytics() {
        switch (this.f9012l) {
            case 0:
                return R.string.cache_ch;
            default:
                return R.string.downloader_saf_channel;
        }
    }

    @Override // defpackage.AbstractC16377l
    public final String loadAd() {
        switch (this.f9012l) {
            case 0:
                return "cacheChannel";
            default:
                return "downloaderChannel";
        }
    }

    @Override // defpackage.AbstractC16377l
    public final String mopub() {
        switch (this.f9012l) {
            case 0:
                return "cache";
            default:
                return "download";
        }
    }

    @Override // defpackage.AbstractC16377l
    public final int yandex() {
        switch (this.f9012l) {
            case 0:
                return R.string.cache_ch_desc;
            default:
                return R.string.downloader_saf_channel_desc;
        }
    }
}
