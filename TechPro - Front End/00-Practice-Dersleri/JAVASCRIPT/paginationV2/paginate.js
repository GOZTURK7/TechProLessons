const paginate = (followers, sayfa) => {

    const itemsPerPage = sayfa;
    const numberOfPages = Math.ceil(followers.length / itemsPerPage);

    const newFollowers = Array.from({ length: numberOfPages }, (_, index) => {
        const start = index * itemsPerPage;
        return followers.slice(start, start + itemsPerPage);
    });

    return newFollowers;

};

export default paginate;
