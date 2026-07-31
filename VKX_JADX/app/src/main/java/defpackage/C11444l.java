package defpackage;

import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioPlaylistSnippetEntry;

/* JADX INFO: renamed from: lُۣۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11444l extends AbstractC8189l {
    public static final C8688l admob = new C8688l(new C14499l(10));
    public final String billing;
    public final String mopub;

    public C11444l(int i, int i2, int i3, long j, String str) {
        super(AbstractC15639l.mopub(List.class, AudioPlaylistSnippetEntry.class));
        this.billing = "execute";
        this.mopub = "";
        vip("code", (String) admob.getValue());
        remoteconfig(Integer.valueOf(i), "playlist_id");
        startapp("owner_id", Long.valueOf(j));
        vip("access_key", str);
        remoteconfig(3, "count");
        remoteconfig(Integer.valueOf(i2), "offset");
        remoteconfig(Integer.valueOf(i3), "shuffle_seed");
    }

    @Override // defpackage.AbstractC8189l
    public final String firebase() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC8189l
    public final String isPro() {
        return this.billing;
    }
}
