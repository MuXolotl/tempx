package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: lٖٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteCallbackListC15118l extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService yandex;

    public RemoteCallbackListC15118l(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.yandex = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        this.yandex.f474l.remove((Integer) obj);
    }
}
