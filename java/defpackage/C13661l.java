package defpackage;

import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkapi2.internal.objects.VKError;

/* JADX INFO: renamed from: lْٜۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13661l extends Exception {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ int f26686l = 0;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f26687l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f26688l;

    public C13661l(String str, List list) {
        this.f26688l = str;
        this.f26687l = list;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return loadAd();
    }

    public final String loadAd() {
        StringBuilder sb = new StringBuilder("[VE] Method: ");
        sb.append(this.f26688l);
        sb.append(" / Error: ");
        sb.append(yandex().loadAd);
        sb.append(" [");
        return AbstractC14814l.remoteconfig(yandex().yandex, "]\n", sb);
    }

    public final VKError yandex() {
        return (VKError) AbstractC16901l.m4231native(this.f26687l);
    }

    public C13661l(String str, VKError vKError) {
        this(str, Collections.singletonList(vKError));
    }
}
