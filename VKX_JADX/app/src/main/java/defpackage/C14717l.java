package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.auth.VkConnectResponse;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؘٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14717l extends AbstractC13852l {
    public final boolean amazon;
    public final C8195l billing;
    public final boolean purchase;

    public C14717l(String str) {
        super(VkConnectResponse.class, "/oauth/token/");
        this.amazon = true;
        this.purchase = true;
        C6168l c6168l = C6168l.f12991l;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.billing = new C8195l("POST", AbstractC8676l.remoteconfig(new C8195l("device_id", c6168l.adcel()), new C8195l("device_os", "android"), new C8195l("grant_type", "refresh_token"), new C8195l("refresh_token", str)));
    }

    @Override // defpackage.AbstractC13852l
    public final boolean admob() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC13852l
    public final C8195l amazon() {
        return this.billing;
    }

    @Override // defpackage.AbstractC13852l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.AbstractC13852l
    public final boolean mopub() {
        return this.purchase;
    }
}
