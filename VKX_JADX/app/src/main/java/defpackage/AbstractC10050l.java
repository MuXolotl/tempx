package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: lَؓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10050l implements Cloneable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public AbstractC0288l f20498l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC0288l f20499l;

    public AbstractC10050l(AbstractC0288l abstractC0288l) {
        this.f20499l = abstractC0288l;
        if (abstractC0288l.mopub()) {
            C8339l.metrica("Default instance must be immutable.");
            throw null;
        }
        this.f20498l = abstractC0288l.subs();
    }

    public static void yandex(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final AbstractC0288l amazon() {
        boolean zMopub = this.f20498l.mopub();
        AbstractC0288l abstractC0288l = this.f20498l;
        if (zMopub) {
            abstractC0288l.getClass();
            C8307l.crashlytics.yandex(abstractC0288l.getClass()).loadAd(abstractC0288l);
            abstractC0288l.admob();
            abstractC0288l = this.f20498l;
        }
        abstractC0288l.getClass();
        if (AbstractC0288l.adcel(abstractC0288l, true)) {
            return abstractC0288l;
        }
        throw new C1408l();
    }

    public final void billing(byte[] bArr, int i, C11337l c11337l) throws C9893l {
        if (!this.f20498l.mopub()) {
            AbstractC0288l abstractC0288lSubs = this.f20499l.subs();
            C8307l.crashlytics.yandex(abstractC0288lSubs.getClass()).yandex(abstractC0288lSubs, this.f20498l);
            this.f20498l = abstractC0288lSubs;
        }
        try {
            C8307l.crashlytics.yandex(this.f20498l.getClass()).billing(this.f20498l, bArr, 0, i, new C16292l(c11337l));
        } catch (IOException e) {
            C18073l.Signature("Reading from byte array should not throw IOException.", e);
        } catch (IndexOutOfBoundsException unused) {
            C11586l.admob("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (C9893l e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: crashlytics, reason: merged with bridge method [inline-methods] */
    public final AbstractC10050l clone() {
        AbstractC10050l abstractC10050l = (AbstractC10050l) this.f20499l.subscription(5);
        boolean zMopub = this.f20498l.mopub();
        AbstractC0288l abstractC0288l = this.f20498l;
        if (zMopub) {
            abstractC0288l.getClass();
            C8307l.crashlytics.yandex(abstractC0288l.getClass()).loadAd(abstractC0288l);
            abstractC0288l.admob();
            abstractC0288l = this.f20498l;
        }
        abstractC10050l.f20498l = abstractC0288l;
        return abstractC10050l;
    }

    public final void loadAd() {
        if (this.f20498l.mopub()) {
            return;
        }
        AbstractC0288l abstractC0288lSubs = this.f20499l.subs();
        C8307l.crashlytics.yandex(abstractC0288lSubs.getClass()).yandex(abstractC0288lSubs, this.f20498l);
        this.f20498l = abstractC0288lSubs;
    }

    public final void purchase(AbstractC0288l abstractC0288l) {
        AbstractC0288l abstractC0288l2 = this.f20499l;
        if (abstractC0288l2.equals(abstractC0288l)) {
            return;
        }
        if (!this.f20498l.mopub()) {
            AbstractC0288l abstractC0288lSubs = abstractC0288l2.subs();
            C8307l.crashlytics.yandex(abstractC0288lSubs.getClass()).yandex(abstractC0288lSubs, this.f20498l);
            this.f20498l = abstractC0288lSubs;
        }
        AbstractC0288l abstractC0288l3 = this.f20498l;
        C8307l.crashlytics.yandex(abstractC0288l3.getClass()).yandex(abstractC0288l3, abstractC0288l);
    }
}
