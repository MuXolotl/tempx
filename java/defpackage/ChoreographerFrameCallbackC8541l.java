package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC8541l implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C13896l f17631l;

    public ChoreographerFrameCallbackC8541l(C13896l c13896l) {
        this.f17631l = c13896l;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f17631l.f27168l.removeCallbacks(this);
        C13896l.m3799l(this.f17631l);
        C13896l c13896l = this.f17631l;
        synchronized (c13896l.f27167l) {
            if (c13896l.f27166l) {
                c13896l.f27166l = false;
                ArrayList arrayList = c13896l.f27164l;
                c13896l.f27164l = c13896l.f27165l;
                c13896l.f27165l = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C13896l.m3799l(this.f17631l);
        C13896l c13896l = this.f17631l;
        synchronized (c13896l.f27167l) {
            try {
                if (c13896l.f27164l.isEmpty()) {
                    c13896l.f27163l.removeFrameCallback(this);
                    c13896l.f27166l = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
