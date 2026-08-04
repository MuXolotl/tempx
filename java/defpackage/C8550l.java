package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lٌٌؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8550l {
    public Integer yandex;

    public final Integer yandex(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.yandex = Integer.valueOf(unicodeChar & Alert.DURATION_SHOW_INDEFINITELY);
            return null;
        }
        Integer num = this.yandex;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.yandex = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num2 != null) {
            unicodeChar = num2.intValue();
        }
        return Integer.valueOf(unicodeChar);
    }
}
