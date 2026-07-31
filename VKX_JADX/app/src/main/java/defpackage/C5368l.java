package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؘؑۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5368l extends AbstractC3799l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final AbstractC8481l f11505l = AbstractC8481l.Signature(EnumC17969l.ALBUM, EnumC17969l.ARTIST, EnumC17969l.ALBUM_ARTIST, EnumC17969l.TITLE, EnumC17969l.TRACK, EnumC17969l.GENRE, EnumC17969l.COMMENT, EnumC17969l.YEAR, EnumC17969l.RECORD_LABEL, EnumC17969l.ISRC, EnumC17969l.COMPOSER, EnumC17969l.LYRICIST, EnumC17969l.ENCODER, EnumC17969l.CONDUCTOR, EnumC17969l.RATING);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ArrayList f11508l = new ArrayList();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Long f11506l = null;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Long f11507l = null;

    public final long tapsense() {
        Long l = this.f11507l;
        if (l == null || this.f11506l == null) {
            return 0L;
        }
        return (l.longValue() - this.f11506l.longValue()) - 8;
    }

    @Override // defpackage.AbstractC11779l
    public final String toString() {
        StringBuilder sb = new StringBuilder("Wav Info Tag:\n");
        if (this.f11506l != null) {
            sb.append("\tstartLocation:");
            sb.append(AbstractC6419l.purchase(this.f11506l.longValue()));
            sb.append("\n");
        }
        if (this.f11507l != null) {
            sb.append("\tendLocation:");
            sb.append(AbstractC6419l.purchase(this.f11507l.longValue()));
            sb.append("\n");
        }
        sb.append(super.toString());
        ArrayList<InterfaceC7988l> arrayList = this.f11508l;
        if (arrayList.size() > 0) {
            sb.append("\nUnrecognized Tags:\n");
            for (InterfaceC7988l interfaceC7988l : arrayList) {
                sb.append("\t");
                sb.append(interfaceC7988l.getId());
                sb.append(":");
                sb.append(interfaceC7988l.admob());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override // defpackage.AbstractC3799l, defpackage.InterfaceC15476l
    public final AbstractC8481l vip() {
        return f11505l;
    }
}
