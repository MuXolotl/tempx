package defpackage;

/* JADX INFO: renamed from: lِۡؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12175l extends AbstractC7775l {
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof C0408l) {
            string = "\"" + ((Object) ((C0408l) this).yandex) + '\"';
        } else {
            string = yandex().toString();
        }
        return AbstractC2812l.tapsense(sb, string, ')');
    }

    public abstract Object yandex();
}
