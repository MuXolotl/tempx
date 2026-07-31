package androidx.media3.session;

import android.content.Intent;
import android.os.IBinder;
import defpackage.AbstractServiceC3639l;
import defpackage.BinderC7189l;
import defpackage.C13572l;
import defpackage.C6499l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class MediaLibraryService extends AbstractServiceC3639l {
    @Override // defpackage.AbstractServiceC3639l, defpackage.AbstractServiceC4696l, android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!"androidx.media3.session.MediaLibraryService".equals(intent.getAction())) {
            return super.onBind(intent);
        }
        BinderC7189l binderC7189l = this.f7617l;
        binderC7189l.getClass();
        return binderC7189l;
    }

    @Override // defpackage.AbstractServiceC3639l
    /* JADX INFO: renamed from: startapp */
    public abstract C13572l subs(C6499l c6499l);
}
