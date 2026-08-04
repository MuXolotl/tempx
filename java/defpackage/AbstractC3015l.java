package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؔۤٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3015l {
    public static final Object yandex;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).build();
        yandex = new Object();
    }
}
