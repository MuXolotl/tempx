package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: renamed from: lِّۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13007l implements Closeable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f25484l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f25485l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f25486l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final RandomAccessFile f25487l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ReentrantLock f25488l = new ReentrantLock();

    public C13007l(boolean z, RandomAccessFile randomAccessFile) {
        this.f25486l = z;
        this.f25487l = randomAccessFile;
    }

    public static C18352l yandex(C13007l c13007l) {
        if (!c13007l.f25486l) {
            C8339l.smaato("file handle is read-only");
            return null;
        }
        ReentrantLock reentrantLock = c13007l.f25488l;
        reentrantLock.lock();
        try {
            if (c13007l.f25485l) {
                throw new IllegalStateException("closed");
            }
            c13007l.f25484l++;
            reentrantLock.unlock();
            return new C18352l(c13007l);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final C13289l billing(long j) {
        ReentrantLock reentrantLock = this.f25488l;
        reentrantLock.lock();
        try {
            if (this.f25485l) {
                throw new IllegalStateException("closed");
            }
            this.f25484l++;
            reentrantLock.unlock();
            return new C13289l(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f25488l;
        reentrantLock.lock();
        try {
            if (this.f25485l) {
                reentrantLock.unlock();
                return;
            }
            this.f25485l = true;
            if (this.f25484l != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            synchronized (this) {
                this.f25487l.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f25486l) {
            C8339l.smaato("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.f25488l;
        reentrantLock.lock();
        try {
            if (this.f25485l) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            synchronized (this) {
                this.f25487l.getFD().sync();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f25488l;
        reentrantLock.lock();
        try {
            if (this.f25485l) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f25487l.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
