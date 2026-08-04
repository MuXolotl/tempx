package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: lًٟؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7781l extends InputConnectionWrapper {
    public final /* synthetic */ InterfaceC9481l yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7781l(InputConnection inputConnection, InterfaceC9481l interfaceC9481l) {
        super(inputConnection, false);
        this.yandex = interfaceC9481l;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C5138l c5138l = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c5138l = new C5138l(16, new C9248l(inputContentInfo));
        }
        if (this.yandex.yandex(c5138l, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
