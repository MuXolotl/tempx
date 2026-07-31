package defpackage;

import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lّ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17685l extends AbstractC7317l {
    public final String billing;
    public final AudioPlaylist purchase;

    public C17685l(AudioPlaylist audioPlaylist, List list, String str) {
        super(AbstractC14770l.smaato(audioPlaylist) + '_' + str, audioPlaylist.mopub, list);
        this.purchase = audioPlaylist;
        this.billing = str;
    }
}
