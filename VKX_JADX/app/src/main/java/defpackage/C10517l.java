package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَّۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10517l implements Parcelable {
    public static final Parcelable.Creator<C10517l> CREATOR = new C17440l(22);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public MediaSession.QueueItem f21397l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f21398l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0579l f21399l;

    public C10517l(MediaSession.QueueItem queueItem, C0579l c0579l, long j) {
        if (j == -1) {
            C8339l.metrica("Id cannot be QueueItem.UNKNOWN_ID");
            throw null;
        }
        this.f21399l = c0579l;
        this.f21398l = j;
        this.f21397l = queueItem;
    }

    public static ArrayList yandex(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new C10517l(queueItem, C0579l.yandex(queueItem.getDescription()), queueItem.getQueueId()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.f21399l);
        sb.append(", Id=");
        return AbstractC15560l.ads(this.f21398l, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f21399l.writeToParcel(parcel, i);
        parcel.writeLong(this.f21398l);
    }

    public C10517l(Parcel parcel) {
        this.f21399l = C0579l.CREATOR.createFromParcel(parcel);
        this.f21398l = parcel.readLong();
    }
}
