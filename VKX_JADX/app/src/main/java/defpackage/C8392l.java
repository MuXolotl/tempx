package defpackage;

import android.provider.MediaStore;

/* JADX INFO: renamed from: lًۥٍ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8392l extends AbstractC3031l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8392l(int i) {
        super(AbstractC11173l.amazon(4) ? MediaStore.Audio.Albums.getContentUri("external") : MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album", "artist_id", "artist", "numsongs", "maxyear", "album_art"}, new C9673l(11), 1);
        switch (i) {
            case 2:
                super(AbstractC11173l.amazon(4) ? MediaStore.Audio.Media.getContentUri("external") : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "duration", "album", "album_id", "artist", "artist_id", "_data"}, new C9673l(13), 1);
                break;
            default:
                break;
        }
    }
}
