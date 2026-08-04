package defpackage;

import java.util.UUID;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* JADX INFO: renamed from: lٖۦْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16778l extends AbstractC8189l {
    public final String billing;
    public final String mopub;

    public AbstractC16778l() {
        super(Catalog2Response.class);
        this.billing = "vkxSynth";
        this.mopub = "offlineRequest";
    }

    public static String tapsense() {
        return AbstractC16648l.advert(UUID.randomUUID().toString(), "-", "", false);
    }

    @Override // defpackage.AbstractC8189l
    public final String firebase() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC8189l
    public final String isPro() {
        return this.billing;
    }

    @Override // defpackage.AbstractC8189l
    public final Object mopub(AbstractC0283l abstractC0283l) {
        return subscription(abstractC0283l);
    }

    public abstract Object subscription(AbstractC0283l abstractC0283l);
}
