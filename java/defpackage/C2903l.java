package defpackage;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: lؔۛؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C2903l extends InputConnectionC7023l {
    @Override // defpackage.InputConnectionC7023l, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.loadAd;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // defpackage.InputConnectionC7023l, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.loadAd;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }

    @Override // defpackage.InputConnectionC7023l
    public final void yandex(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }
}
