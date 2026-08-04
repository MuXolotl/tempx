package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: renamed from: lؗۘؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5101l extends C3446l {
    public static final C14785l admob;
    public static final Condition firebase;
    public static final ReentrantLock isPro;
    public static final long remoteconfig;
    public static final long smaato;
    public static C5101l subs;
    public int billing = -1;
    public long mopub;
    public int purchase;

    static {
        C14785l c14785l = new C14785l((char) 0, 18);
        c14785l.f28907l = new C5101l[8];
        admob = c14785l;
        ReentrantLock reentrantLock = new ReentrantLock();
        isPro = reentrantLock;
        firebase = reentrantLock.newCondition();
        smaato = 60000L;
        remoteconfig = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    public final void admob() {
        long j = this.crashlytics;
        boolean z = this.yandex;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = isPro;
            reentrantLock.lock();
            try {
                if (this.purchase != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.purchase = 1;
                C15718l.isPro(this);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public IOException isPro(IOException iOException) {
        throw null;
    }

    public final boolean subs() {
        ReentrantLock reentrantLock = isPro;
        reentrantLock.lock();
        try {
            int i = this.purchase;
            this.purchase = 0;
            if (i != 1) {
                return i == 2;
            }
            admob.ad(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void firebase() {
    }
}
