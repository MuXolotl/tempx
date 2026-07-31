package defpackage;

import java.util.HashMap;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lِٖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14832l {
    public static final /* synthetic */ int yandex = 0;

    static {
        HashMap map = new HashMap();
        new C3077l();
        int i = 29;
        map.put("MD5", new C8565l(i));
        new C0655l();
        map.put("SHA-1", new C1083l(i));
        new C9102l();
        map.put("SHA-224", new C11485l(i));
        new C2657l();
        map.put("SHA-256", new C15718l(i));
        new C5153l();
        int i2 = 0;
        map.put("SHA-384", new C16936l(i2));
        new C17711l();
        map.put("SHA-512", new C10819l(0));
        map.put(yandex().getAlgorithmName(), new C13975l(0));
        map.put(loadAd().getAlgorithmName(), new C16222l(i2));
        map.put(crashlytics().getAlgorithmName(), new C9912l(i2));
        map.put(amazon().getAlgorithmName(), new C7472l(i));
        map.put(new C17951l(128).getAlgorithmName(), new C1461l(i));
        map.put(new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES).getAlgorithmName(), new C17334l(i));
    }

    public static C4604l amazon() {
        return new C4604l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
    }

    public static C4604l crashlytics() {
        return new C4604l(384);
    }

    public static C4604l loadAd() {
        return new C4604l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public static C4604l yandex() {
        return new C4604l(224);
    }
}
