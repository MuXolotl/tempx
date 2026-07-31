package androidx.car.app.serialization;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.billing;
import defpackage.AbstractC14814l;
import defpackage.C11467l;
import defpackage.InterfaceC11652l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12298l;
import defpackage.InterfaceC12745l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\"B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0012¢\u0006\u0004\b\u0005\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016¨\u0006#"}, d2 = {"Landroidx/car/app/serialization/ListDelegateImpl;", "T", "Llّۣؐ;", "", "content", "<init>", "(Ljava/util/List;)V", "()V", "", "startIndex", "endIndex", "Llّٖٞ;", "callback", "", "requestItemRange", "(IILlّٖٞ;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "_size", "I", "listHashCode", "Landroidx/car/app/serialization/IRemoteList;", "mStub", "Landroidx/car/app/serialization/IRemoteList;", "getSize", "size", "RemoteListStub", "app"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ListDelegateImpl<T> implements InterfaceC12298l {
    private int _size;
    private int listHashCode;
    private IRemoteList mStub;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/car/app/serialization/ListDelegateImpl$RemoteListStub;", "T", "Landroidx/car/app/serialization/IRemoteList$Stub;", "mContent", "", "<init>", "(Ljava/util/List;)V", "requestItemRange", "", "startIndex", "", "endIndex", "callback", "Landroidx/car/app/IOnDoneCallback;", "app"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteListStub<T> extends IRemoteList.Stub {
        private final List<T> mContent;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteListStub(List<? extends T> list) {
            this.mContent = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object requestItemRange$lambda$0(RemoteListStub remoteListStub, int i, int i2) {
            return remoteListStub.mContent.subList(i, i2 + 1);
        }

        @Override // androidx.car.app.serialization.IRemoteList
        public void requestItemRange(final int startIndex, final int endIndex, IOnDoneCallback callback) {
            billing.crashlytics(callback, "lazy load content", new InterfaceC11652l() { // from class: androidx.car.app.serialization.yandex
                @Override // defpackage.InterfaceC11652l
                public final Object yandex() {
                    return ListDelegateImpl.RemoteListStub.requestItemRange$lambda$0(this.f320l, startIndex, endIndex);
                }
            });
        }
    }

    public ListDelegateImpl(List<? extends T> list) {
        this._size = -1;
        this.listHashCode = -1;
        this._size = list.size();
        this.listHashCode = list.hashCode();
        this.mStub = new RemoteListStub(list);
    }

    public boolean equals(Object other) {
        return (other instanceof ListDelegateImpl) && ((ListDelegateImpl) other).listHashCode == this.listHashCode;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int get_size() {
        return this._size;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getListHashCode() {
        return this.listHashCode;
    }

    public void requestItemRange(int startIndex, int endIndex, InterfaceC12745l callback) {
        get_size();
        try {
            IRemoteList iRemoteList = this.mStub;
            if (iRemoteList == null) {
                iRemoteList = null;
            }
            iRemoteList.requestItemRange(startIndex, endIndex, billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListDelegate { Size: ");
        sb.append(get_size());
        sb.append(", listHashCode: ");
        return AbstractC14814l.remoteconfig(this.listHashCode, " }", sb);
    }

    private ListDelegateImpl() {
        this._size = -1;
        this.listHashCode = -1;
    }
}
