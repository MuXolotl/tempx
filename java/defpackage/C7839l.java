package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lًؙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C7839l implements InterfaceC2373l {
    public static final C9425l Companion = new C9425l();
    public final String amazon;
    public final String crashlytics;
    public final long loadAd;
    public final int yandex;

    public /* synthetic */ C7839l(int i, int i2, long j, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C5642l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = j;
        this.crashlytics = str;
        if ((i & 8) != 0) {
            this.amazon = str2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i2);
        this.amazon = sb.toString();
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7839l)) {
            return false;
        }
        C7839l c7839l = (C7839l) obj;
        return this.yandex == c7839l.yandex && this.loadAd == c7839l.loadAd && AbstractC8576l.yandex(this.crashlytics, c7839l.crashlytics);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.amazon;
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        return this.crashlytics.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Episode(trackId=");
        sb.append(this.yandex);
        sb.append(", ownerId=");
        sb.append(this.loadAd);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC2373l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        C3744l c3744l;
        if (interfaceC14029l instanceof C3744l) {
            c3744l = (C3744l) interfaceC14029l;
            int i = c3744l.f7831l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3744l.f7831l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3744l = new C3744l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c3744l = new C3744l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objAdmob = c3744l.f7830l;
        int i2 = c3744l.f7831l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C12772l c12772l = new C12772l(this.loadAd, this.yandex);
            c3744l.f7831l = 1;
            objAdmob = AbstractC8189l.admob(c12772l, c3744l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAdmob);
        }
        return Collections.singletonList(objAdmob);
    }

    public C7839l(long j, int i, String str) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = str;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        this.amazon = sb.toString();
    }

    public C7839l(AudioTrack audioTrack) {
        this(audioTrack.crashlytics, audioTrack.loadAd, audioTrack.yandex);
    }
}
