package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: lؑۦّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0711l {
    public C8892l amazon;
    public final C7067l crashlytics = new C7067l(0, this);
    public final CharSequence loadAd;
    public final Matcher yandex;

    public C0711l(Matcher matcher, CharSequence charSequence) {
        this.yandex = matcher;
        this.loadAd = charSequence;
    }

    public final C0711l crashlytics() {
        Matcher matcher = this.yandex;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.loadAd;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        if (matcher2.find(iEnd)) {
            return new C0711l(matcher2, charSequence);
        }
        return null;
    }

    public final C8934l loadAd() {
        Matcher matcher = this.yandex;
        return AbstractC8576l.adcel(matcher.start(), matcher.end());
    }

    public final List yandex() {
        if (this.amazon == null) {
            this.amazon = new C8892l(0, this);
        }
        return this.amazon;
    }
}
