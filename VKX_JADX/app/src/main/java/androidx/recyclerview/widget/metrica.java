package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import defpackage.AbstractC12994l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC5020l;
import defpackage.C13036l;
import defpackage.C18262l;
import defpackage.C18353l;
import defpackage.C8339l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class metrica {
    public static final List tapsense = Collections.EMPTY_LIST;
    public RecyclerView ads;
    public int isPro;
    public WeakReference loadAd;
    public subs subscription;
    public final View yandex;
    public int crashlytics = -1;
    public int amazon = -1;
    public long purchase = -1;
    public int billing = -1;
    public int mopub = -1;
    public metrica admob = null;
    public metrica subs = null;
    public ArrayList firebase = null;
    public List smaato = null;
    public int remoteconfig = 0;
    public firebase vip = null;
    public boolean metrica = false;
    public int startapp = 0;
    public int adcel = -1;

    public metrica(View view) {
        if (view != null) {
            this.yandex = view;
        } else {
            C8339l.metrica("itemView may not be null");
            throw null;
        }
    }

    public final boolean adcel() {
        return (this.isPro & 128) != 0;
    }

    public final boolean admob() {
        return (this.isPro & 4) != 0;
    }

    public final boolean ads() {
        return (this.isPro & 32) != 0;
    }

    public final int amazon() {
        int i = this.mopub;
        return i == -1 ? this.crashlytics : i;
    }

    public final boolean billing() {
        View view = this.yandex;
        return (view.getParent() == null || view.getParent() == this.ads) ? false : true;
    }

    public final int crashlytics() {
        RecyclerView recyclerView;
        subs adapter;
        int adapterPositionInRecyclerView;
        if (this.subscription == null || (recyclerView = this.ads) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.ads.getAdapterPositionInRecyclerView(this)) == -1) {
            return -1;
        }
        return adapter.purchase(this.subscription, this, adapterPositionInRecyclerView);
    }

    public final boolean firebase() {
        return this.vip != null;
    }

    public final boolean isPro() {
        return (this.isPro & 8) != 0;
    }

    public final int loadAd() {
        RecyclerView recyclerView = this.ads;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionInRecyclerView(this);
    }

    public final void metrica() {
        if (RecyclerView.sDebugAssertionsEnabled && smaato()) {
            C18262l.firebase(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.isPro = 0;
        this.crashlytics = -1;
        this.amazon = -1;
        this.purchase = -1L;
        this.mopub = -1;
        this.remoteconfig = 0;
        this.admob = null;
        this.subs = null;
        ArrayList arrayList = this.firebase;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.isPro &= -1025;
        this.startapp = 0;
        this.adcel = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    public final boolean mopub() {
        return (this.isPro & 1) != 0;
    }

    public final List purchase() {
        ArrayList arrayList;
        return ((this.isPro & 1024) != 0 || (arrayList = this.firebase) == null || arrayList.size() == 0) ? tapsense : this.smaato;
    }

    public final boolean remoteconfig() {
        return (this.isPro & 2) != 0;
    }

    public final boolean smaato() {
        return (this.isPro & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    public final void startapp(boolean z) {
        int i = this.remoteconfig;
        int i2 = z ? i - 1 : i + 1;
        this.remoteconfig = i2;
        if (i2 < 0) {
            this.remoteconfig = 0;
            if (RecyclerView.sDebugAssertionsEnabled) {
                C18353l.metrica(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                return;
            } else {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i2 == 1) {
            this.isPro |= 16;
        } else if (z && i2 == 0) {
            this.isPro &= -17;
        }
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean subs() {
        if ((this.isPro & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        return !this.yandex.hasTransientState();
    }

    public final String toString() {
        StringBuilder sbAdvert = AbstractC5020l.advert(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbAdvert.append(Integer.toHexString(hashCode()));
        sbAdvert.append(" position=");
        sbAdvert.append(this.crashlytics);
        sbAdvert.append(" id=");
        sbAdvert.append(this.purchase);
        sbAdvert.append(", oldPos=");
        sbAdvert.append(this.amazon);
        sbAdvert.append(", pLpos:");
        sbAdvert.append(this.mopub);
        StringBuilder sb = new StringBuilder(sbAdvert.toString());
        if (firebase()) {
            sb.append(" scrap ");
            sb.append(this.metrica ? "[changeScrap]" : "[attachedScrap]");
        }
        if (admob()) {
            sb.append(" invalid");
        }
        if (!mopub()) {
            sb.append(" unbound");
        }
        if ((this.isPro & 2) != 0) {
            sb.append(" update");
        }
        if (isPro()) {
            sb.append(" removed");
        }
        if (adcel()) {
            sb.append(" ignored");
        }
        if (smaato()) {
            sb.append(" tmpDetached");
        }
        if (!subs()) {
            sb.append(" not recyclable(" + this.remoteconfig + ")");
        }
        if ((this.isPro & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 || admob()) {
            sb.append(" undefined adapter position");
        }
        if (this.yandex.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void vip(int i, boolean z) {
        if (this.amazon == -1) {
            this.amazon = this.crashlytics;
        }
        if (this.mopub == -1) {
            this.mopub = this.crashlytics;
        }
        if (z) {
            this.mopub += i;
        }
        this.crashlytics += i;
        View view = this.yandex;
        if (view.getLayoutParams() != null) {
            ((C13036l) view.getLayoutParams()).crashlytics = true;
        }
    }

    public final void yandex(int i) {
        this.isPro = i | this.isPro;
    }
}
