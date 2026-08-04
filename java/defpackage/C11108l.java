package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lُ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11108l implements InterfaceC18108l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f22314l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C10038l f22315l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayDeque f22316l = new ArrayDeque();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f22317l = false;

    public C11108l(C2582l c2582l) {
        AbstractC12225l.crashlytics();
        this.f22314l = new ArrayList();
    }

    public final void crashlytics() {
        int iMo1997strictfp;
        AbstractC12225l.crashlytics();
        Log.d("TakePictureManagerImpl", "Issue the next TakePictureRequest.");
        if (this.f22317l) {
            Log.d("TakePictureManagerImpl", "The class is paused.");
            return;
        }
        C10038l c10038l = this.f22315l;
        c10038l.getClass();
        AbstractC12225l.crashlytics();
        C0554l c0554l = (C0554l) c10038l.f20462l;
        c0554l.getClass();
        AbstractC12225l.crashlytics();
        AbstractC5641l.purchase("The ImageReader is not initialized.", ((C6344l) c0554l.f1958l) != null);
        C6344l c6344l = (C6344l) c0554l.f1958l;
        synchronized (c6344l.f13303l) {
            iMo1997strictfp = ((InterfaceC12679l) c6344l.f13308l).mo1997strictfp() - c6344l.f13305l;
        }
        if (iMo1997strictfp == 0) {
            Log.d("TakePictureManagerImpl", "Too many acquire images. Close image to be able to process next.");
        } else if (this.f22316l.poll() == null) {
            Log.d("TakePictureManagerImpl", "No new request.");
        } else {
            C18725l.loadAd();
        }
    }

    public final void loadAd() {
        AbstractC12225l.crashlytics();
        new C9262l(3, "Camera is closed.", null);
        ArrayDeque arrayDeque = this.f22316l;
        Iterator it = arrayDeque.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.f22314l).iterator();
        if (it2.hasNext()) {
            AbstractC12589l.m3424strictfp(it2.next());
            throw null;
        }
    }

    @Override // defpackage.InterfaceC18108l
    public final void yandex(AbstractC12655l abstractC12655l) {
        AbstractC12272l.admob().execute(new RunnableC6665l(8, this));
    }
}
